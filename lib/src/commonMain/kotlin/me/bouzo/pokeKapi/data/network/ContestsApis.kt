package me.bouzo.pokeKapi.data.network

import me.bouzo.pokeKapi.data.models.Identifier
import me.bouzo.pokeKapi.data.models.contests.effects.ContestEffect
import me.bouzo.pokeKapi.data.models.contests.superEffects.SuperContestEffect
import me.bouzo.pokeKapi.data.models.contests.types.ContestType

/**
 * Interface encapsulating all the endpoints within the Contests Group on
 * PokeApi's API
 * See [PokeApi](https://pokeapi.co/docs/v2#contests-section)
 */
interface ContestsApis {
    suspend fun getContestType(id: Identifier): Result<ContestType>
    suspend fun getContestEffect(id: Identifier): Result<ContestEffect>
    suspend fun getSuperContestEffect(id: Identifier): Result<SuperContestEffect>
}

internal class ContestsRemoteApis(private val baseApi: BaseApi) : ContestsApis {
    override suspend fun getContestType(id: Identifier): Result<ContestType> =
        baseApi.fetch("/contest-type/$id")

    override suspend fun getContestEffect(id: Identifier): Result<ContestEffect> =
        baseApi.fetch("/contest-effect/$id")

    override suspend fun getSuperContestEffect(id: Identifier): Result<SuperContestEffect> =
        baseApi.fetch("/super-contest-effect/$id")
}