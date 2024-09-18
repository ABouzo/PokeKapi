package me.bouzo.pokeKapi.data.network

import me.bouzo.pokeKapi.data.models.Identifier
import me.bouzo.pokeKapi.data.models.berries.berries.Berry
import me.bouzo.pokeKapi.data.models.berries.firmnesses.BerryFirmness
import me.bouzo.pokeKapi.data.models.berries.flavors.BerryFlavor
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResourceList

/**
 * Interface encapsulating all the endpoints within the Berries Group on
 * PokeApi's API
 * See [PokeApi](https://pokeapi.co/docs/v2#berries-section)
 */
interface BerriesApis {
    suspend fun getBerry(id: Identifier): Result<Berry>
    suspend fun getBerryFirmness(id: Identifier): Result<BerryFirmness>
    suspend fun getBerryFlavor(id: Identifier): Result<BerryFlavor>

    suspend fun getBerries(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getBerryFirmnesses(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getBerryFlavors(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
}

internal class BerriesRemoteApis(private val baseApi: BaseApi) : BerriesApis {
    override suspend fun getBerry(id: Identifier): Result<Berry> =
        baseApi.fetch("/berry/$id")

    override suspend fun getBerryFirmness(id: Identifier): Result<BerryFirmness> =
        baseApi.fetch("/berry-firmness/$id")

    override suspend fun getBerryFlavor(id: Identifier): Result<BerryFlavor> =
        baseApi.fetch("/berry-flavor/$id")

    override suspend fun getBerries(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/berry", limit, offset)

    override suspend fun getBerryFirmnesses(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/berry-firmness", limit, offset)

    override suspend fun getBerryFlavors(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/berry-flavor", limit, offset)
}