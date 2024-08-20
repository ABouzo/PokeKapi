package me.bouzo.pokeKapi.data.network

import me.bouzo.pokeKapi.data.models.Identifier
import me.bouzo.pokeKapi.data.models.evolution.evolutionChains.EvolutionChain
import me.bouzo.pokeKapi.data.models.evolution.evolutionTriggers.EvolutionTrigger

/**
 * Interface encapsulating all the endpoints within the Evolution Group on
 * PokeApi's API
 * See [PokeApi](https://pokeapi.co/docs/v2#evolution-section)
 */
interface EvolutionApis {
    suspend fun getEvolutionChain(id: Identifier): Result<EvolutionChain>
    suspend fun getEvolutionTrigger(id: Identifier): Result<EvolutionTrigger>
}

internal class EvolutionRemoteApis(private val baseApi: BaseApi) : EvolutionApis {
    override suspend fun getEvolutionChain(id: Identifier): Result<EvolutionChain> =
        baseApi.fetch("/evolution-chain/$id")

    override suspend fun getEvolutionTrigger(id: Identifier): Result<EvolutionTrigger> =
        baseApi.fetch("/evolution-trigger/$id")
}