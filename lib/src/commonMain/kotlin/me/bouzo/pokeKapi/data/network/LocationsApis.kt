package me.bouzo.pokeKapi.data.network

import me.bouzo.pokeKapi.data.models.Identifier
import me.bouzo.pokeKapi.data.models.locations.location.Location
import me.bouzo.pokeKapi.data.models.locations.locationArea.LocationArea
import me.bouzo.pokeKapi.data.models.locations.palParkArea.PalParkArea
import me.bouzo.pokeKapi.data.models.locations.region.Region

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
}

internal class LocationsRemoteApis(private val baseApi: BaseApi) : LocationsApis {
    override suspend fun getLocation(id: Identifier): Result<Location> = baseApi.fetch("/location/$id")
    override suspend fun getLocationArea(id: Identifier): Result<LocationArea> = baseApi.fetch("/location-area/$id")
    override suspend fun getPalParkArea(id: Identifier): Result<PalParkArea> = baseApi.fetch("/pal-park-area/$id")
    override suspend fun getRegion(id: Identifier): Result<Region> = baseApi.fetch("/region/$id")
}