package me.bouzo.pokeKapi.data.network

import me.bouzo.pokeKapi.data.models.Identifier
import me.bouzo.pokeKapi.data.models.berries.berries.Berry
import me.bouzo.pokeKapi.data.models.berries.firmnesses.BerryFirmness
import me.bouzo.pokeKapi.data.models.berries.flavors.BerryFlavor

/**
 * Interface encapsulating all the endpoints within the Berries Group on
 * PokeApi's API
 * See [PokeApi](https://pokeapi.co/docs/v2#berries-section)
 */
interface BerriesApis {
    suspend fun getBerry(id: Identifier): Result<Berry>
    suspend fun getBerryFirmness(id: Identifier): Result<BerryFirmness>
    suspend fun getBerryFlavor(id: Identifier): Result<BerryFlavor>
}

internal class BerriesRemoteApis(private val baseApi: BaseApi) : BerriesApis {
    override suspend fun getBerry(id: Identifier): Result<Berry> =
        baseApi.fetch("/berry/$id")

    override suspend fun getBerryFirmness(id: Identifier): Result<BerryFirmness> =
        baseApi.fetch("/berry-firmness/$id")

    override suspend fun getBerryFlavor(id: Identifier): Result<BerryFlavor> =
        baseApi.fetch("/berry-flavor/$id")
}