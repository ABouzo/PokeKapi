package me.bouzo.pokeKapi.data.network

import me.bouzo.pokeKapi.data.models.Identifier
import me.bouzo.pokeKapi.data.models.locations.location.Location
import me.bouzo.pokeKapi.data.models.locations.locationArea.LocationArea
import me.bouzo.pokeKapi.data.models.locations.palParkArea.PalParkArea
import me.bouzo.pokeKapi.data.models.locations.region.Region
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResourceList

/**
 * Interface encapsulating all the endpoints within the Location Group on
 * PokeApi's API
 * See [PokeApi](https://pokeapi.co/docs/v2#locations-section)
 */
interface LocationsApis {
    suspend fun getLocation(id: Identifier): Result<Location>
    suspend fun getLocationArea(id: Identifier): Result<LocationArea>
    suspend fun getPalParkArea(id: Identifier): Result<PalParkArea>
    suspend fun getRegion(id: Identifier): Result<Region>
    suspend fun getLocations(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getLocationAreas(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getPalParkAreas(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getRegions(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
}

internal class LocationsRemoteApis(private val baseApi: BaseApi) : LocationsApis {
    override suspend fun getLocation(id: Identifier): Result<Location> =
        baseApi.fetch("/location/$id")

    override suspend fun getLocationArea(id: Identifier): Result<LocationArea> =
        baseApi.fetch("/location-area/$id")

    override suspend fun getPalParkArea(id: Identifier): Result<PalParkArea> =
        baseApi.fetch("/pal-park-area/$id")

    override suspend fun getRegion(id: Identifier): Result<Region> = baseApi.fetch("/region/$id")

    override suspend fun getLocations(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/location", limit, offset)

    override suspend fun getLocationAreas(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/location-area", limit, offset)

    override suspend fun getPalParkAreas(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/pal-park-area", limit, offset)

    override suspend fun getRegions(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/region", limit, offset)
}