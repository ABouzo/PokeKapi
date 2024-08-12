package me.bouzo.pokeKapi.data.network

import me.bouzo.pokeKapi.data.models.Identifier
import me.bouzo.pokeKapi.data.models.Machine

/**
 * Interface encapsulating all the endpoints within the Machine Group on
 * PokeApi's API
 * See [PokeApi](https://pokeapi.co/docs/v2#machines-section)
 */
interface MachinesApis {
    suspend fun getMachine(id: Identifier): Result<Machine>
}

internal class MachinesRemoteApis(private val baseApi: BaseApi) : MachinesApis {
    override suspend fun getMachine(id: Identifier): Result<Machine> = baseApi.fetch("/machine/$id")
}