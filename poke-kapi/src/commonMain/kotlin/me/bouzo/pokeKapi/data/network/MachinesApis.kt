package me.bouzo.pokeKapi.data.network

import me.bouzo.pokeKapi.data.models.Identifier
import me.bouzo.pokeKapi.data.models.Machine
import me.bouzo.pokeKapi.data.models.utility.APIResourceList

/**
 * Interface encapsulating all the endpoints within the Machine Group on
 * PokeApi's API
 * See [PokeApi](https://pokeapi.co/docs/v2#machines-section)
 */
interface MachinesApis {
    suspend fun getMachine(id: Identifier): Result<Machine>
    suspend fun getMachines(limit: Int = 20, offset: Int = 0): Result<APIResourceList>
}

internal class MachinesRemoteApis(private val baseApi: BaseApi) : MachinesApis {
    override suspend fun getMachine(id: Identifier): Result<Machine> = baseApi.fetch("/machine/$id")
    override suspend fun getMachines(limit: Int, offset: Int): Result<APIResourceList> =
        baseApi.fetchPagination("/machine", limit, offset)
}