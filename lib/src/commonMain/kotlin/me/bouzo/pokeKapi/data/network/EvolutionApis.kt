package me.bouzo.pokeKapi.data.network

import me.bouzo.pokeKapi.data.models.Identifier
import me.bouzo.pokeKapi.data.models.evolution.evolutionChains.EvolutionChain
import me.bouzo.pokeKapi.data.models.evolution.evolutionTriggers.EvolutionTrigger
import me.bouzo.pokeKapi.data.models.utility.APIResourceList
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResourceList

/**
 * Interface encapsulating all the endpoints within the Evolution Group on
 * PokeApi's API
 * See [PokeApi](https://pokeapi.co/docs/v2#evolution-section)
 */
interface EvolutionApis {
    suspend fun getEvolutionChain(id: Identifier): Result<EvolutionChain>
    suspend fun getEvolutionTrigger(id: Identifier): Result<EvolutionTrigger>
    suspend fun getEvolutionChains(limit: Int = 20, offset: Int = 0): Result<APIResourceList>
    suspend fun getEvolutionTriggers(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
}

internal class EvolutionRemoteApis(private val baseApi: BaseApi) : EvolutionApis {
    override suspend fun getEvolutionChain(id: Identifier): Result<EvolutionChain> =
        baseApi.fetch("/evolution-chain/$id")

    override suspend fun getEvolutionTrigger(id: Identifier): Result<EvolutionTrigger> =
        baseApi.fetch("/evolution-trigger/$id")

    override suspend fun getEvolutionChains(limit: Int, offset: Int): Result<APIResourceList> =
        baseApi.fetchPagination("/evolution-chain", limit, offset)

    override suspend fun getEvolutionTriggers(
        limit: Int,
        offset: Int
    ): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/evolution-trigger", limit, offset)
}