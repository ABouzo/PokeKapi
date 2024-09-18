package me.bouzo.pokeKapi.data.network

import me.bouzo.pokeKapi.data.models.Identifier
import me.bouzo.pokeKapi.data.models.encounters.conditionValues.EncounterConditionValue
import me.bouzo.pokeKapi.data.models.encounters.conditions.EncounterCondition
import me.bouzo.pokeKapi.data.models.encounters.methods.EncounterMethod
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResourceList

/**
 * Interface encapsulating all the endpoints within the Encounters Group on
 * PokeApi's API
 * See [PokeApi](https://pokeapi.co/docs/v2#encounters-section)
 */
interface EncountersApis {
    suspend fun getEncounterMethod(id: Identifier): Result<EncounterMethod>
    suspend fun getEncounterCondition(id: Identifier): Result<EncounterCondition>
    suspend fun getEncounterConditionValue(id: Identifier): Result<EncounterConditionValue>
    suspend fun getEncounterMethods(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getEncounterConditions(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getEncounterConditionValues(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
}

internal class EncountersRemoteApis(private val baseApi: BaseApi) : EncountersApis {
    override suspend fun getEncounterMethod(id: Identifier): Result<EncounterMethod> =
        baseApi.fetch("/encounter-method/$id")

    override suspend fun getEncounterCondition(id: Identifier): Result<EncounterCondition> =
        baseApi.fetch("/encounter-condition/$id")

    override suspend fun getEncounterConditionValue(id: Identifier): Result<EncounterConditionValue> =
        baseApi.fetch("/encounter-condition-value/$id")

    override suspend fun getEncounterMethods(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/encounter-method", limit, offset)

    override suspend fun getEncounterConditions(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/encounter-condition", limit, offset)

    override suspend fun getEncounterConditionValues(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/encounter-condition-value", limit, offset)
}