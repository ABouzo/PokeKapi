package me.bouzo.pokeKapi.data.network

import me.bouzo.pokeKapi.data.models.Identifier
import me.bouzo.pokeKapi.data.models.Machine

interface MachinesApis {
    suspend fun getMachine(id: Identifier): Result<Machine>
}

internal class MachinesRemoteApis(private val baseApi: BaseApi) : MachinesApis {
    override suspend fun getMachine(id: Identifier): Result<Machine> = baseApi.fetch("/machine/$id")
}