package me.bouzo.pokeKapi

import me.bouzo.pokeKapi.data.network.BaseApi
import me.bouzo.pokeKapi.data.network.EvolutionApis
import me.bouzo.pokeKapi.data.network.EvolutionRemoteApis
import me.bouzo.pokeKapi.data.network.GamesApis
import me.bouzo.pokeKapi.data.network.GamesRemoteApis
import me.bouzo.pokeKapi.data.network.ItemsApis
import me.bouzo.pokeKapi.data.network.ItemsRemoteApis
import me.bouzo.pokeKapi.data.network.LocationsApis
import me.bouzo.pokeKapi.data.network.LocationsRemoteApis
import me.bouzo.pokeKapi.data.network.MachinesApis
import me.bouzo.pokeKapi.data.network.MachinesRemoteApis
import me.bouzo.pokeKapi.data.network.MoveApis
import me.bouzo.pokeKapi.data.network.MoveRemoteApis
import me.bouzo.pokeKapi.data.network.PokemonApis
import me.bouzo.pokeKapi.data.network.PokemonRemoteApis


/**
 * The main entry point for the PokeKapi library.
 * Exposes the following endpoint groups:
 * - [PokemonApis]
 * - [MoveApis]
 * - [MachinesApis]
 * - [LocationsApis]
 * - [ItemsApis]
 * - [GamesApis]
 * - [EvolutionApis]
 */
interface PokeKapi : PokemonApis, MoveApis, MachinesApis, LocationsApis, ItemsApis, GamesApis,
    EvolutionApis {
    companion object {
        fun create(): PokeKapi = PokeKapiImpl()
    }
}

internal class PokeKapiImpl private constructor(baseApi: BaseApi) : PokeKapi,
    PokemonApis by PokemonRemoteApis(baseApi),
    MoveApis by MoveRemoteApis(baseApi),
    MachinesApis by MachinesRemoteApis(baseApi),
    LocationsApis by LocationsRemoteApis(baseApi),
    ItemsApis by ItemsRemoteApis(baseApi),
    GamesApis by GamesRemoteApis(baseApi),
    EvolutionApis by EvolutionRemoteApis(baseApi) {

    internal constructor() : this(baseApi = BaseApi())

}