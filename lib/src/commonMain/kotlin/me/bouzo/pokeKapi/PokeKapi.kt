package me.bouzo.pokeKapi

import me.bouzo.pokeKapi.data.network.BaseApi
import me.bouzo.pokeKapi.data.network.MoveApis
import me.bouzo.pokeKapi.data.network.MoveRemoteApis
import me.bouzo.pokeKapi.data.network.PokemonApis
import me.bouzo.pokeKapi.data.network.PokemonRemoteApis
import me.bouzo.pokeKapi.koin.PokeKapiKoinComponent


/**
 * The main entry point for the PokeKapi library.
 * Exposes the following endpoint groups:
 * - [PokemonApis]
 * - [MoveApis]
 */
internal class PokeKapi private constructor(baseApi: BaseApi) :
    PokemonApis by PokemonRemoteApis(baseApi),
    MoveApis by MoveRemoteApis(baseApi), PokeKapiKoinComponent() {

    constructor() : this(baseApi = BaseApi())
}