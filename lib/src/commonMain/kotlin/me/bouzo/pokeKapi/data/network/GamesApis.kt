package me.bouzo.pokeKapi.data.network

import me.bouzo.pokeKapi.data.models.games.generations.Generation
import me.bouzo.pokeKapi.data.models.games.pokedexes.Pokedex
import me.bouzo.pokeKapi.data.models.games.version.Version
import me.bouzo.pokeKapi.data.models.games.versionGroups.VersionGroup
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResourceList

/**
 * Interface encapsulating all the endpoints within the Games Group on
 * PokeApi's API.
 * See [PokeApi](https://pokeapi.co/docs/v2#gamess-section)
 */
interface GamesApis {

    suspend fun getGeneration(id: Int): Result<Generation>
    suspend fun getPokedex(id: Int): Result<Pokedex>
    suspend fun getVersion(id: Int): Result<Version>
    suspend fun getVersionGroup(id: Int): Result<VersionGroup>

    suspend fun getGenerations(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getPokedexes(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getVersions(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
    suspend fun getVersionGroups(limit: Int = 20, offset: Int = 0): Result<NamedAPIResourceList>
}

internal class GamesRemoteApis(private val baseApi: BaseApi) : GamesApis {
    override suspend fun getGeneration(id: Int): Result<Generation> =
        baseApi.fetch("/generation/$id")

    override suspend fun getPokedex(id: Int): Result<Pokedex> = baseApi.fetch("/pokedex/$id")

    override suspend fun getVersion(id: Int): Result<Version> = baseApi.fetch("/version/$id")

    override suspend fun getVersionGroup(id: Int): Result<VersionGroup> =
        baseApi.fetch("/version-group/$id")

    override suspend fun getGenerations(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/generation", limit, offset)

    override suspend fun getPokedexes(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/pokedex", limit, offset)

    override suspend fun getVersions(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/version", limit, offset)

    override suspend fun getVersionGroups(limit: Int, offset: Int): Result<NamedAPIResourceList> =
        baseApi.fetchPagination("/version-group", limit, offset)
}