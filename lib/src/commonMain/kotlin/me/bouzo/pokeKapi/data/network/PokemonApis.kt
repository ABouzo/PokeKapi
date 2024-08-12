package me.bouzo.pokeKapi.data.network

import me.bouzo.pokeKapi.data.models.Identifier
import me.bouzo.pokeKapi.data.models.pokemon.abilities.Ability
import me.bouzo.pokeKapi.data.models.pokemon.athlonStats.PokeathlonStat
import me.bouzo.pokeKapi.data.models.pokemon.characteristics.Characteristic
import me.bouzo.pokeKapi.data.models.pokemon.colors.PokemonColor
import me.bouzo.pokeKapi.data.models.pokemon.egg.EggGroup
import me.bouzo.pokeKapi.data.models.pokemon.form.PokemonForm
import me.bouzo.pokeKapi.data.models.pokemon.gender.Gender
import me.bouzo.pokeKapi.data.models.pokemon.growth.GrowthRate
import me.bouzo.pokeKapi.data.models.pokemon.habitats.PokemonHabitat
import me.bouzo.pokeKapi.data.models.pokemon.location.LocationAreaEncounter
import me.bouzo.pokeKapi.data.models.pokemon.natures.Nature
import me.bouzo.pokeKapi.data.models.pokemon.pokemon.Pokemon
import me.bouzo.pokeKapi.data.models.pokemon.pokemonSpecies.PokemonSpecies
import me.bouzo.pokeKapi.data.models.pokemon.shape.PokemonShape
import me.bouzo.pokeKapi.data.models.pokemon.stats.Stat
import me.bouzo.pokeKapi.data.models.pokemon.types.Type

/**
 * Interface encapsulating all the endpoints within the Pokemon Group on
 * PokeApi's API
 * See [PokeApi](https://pokeapi.co/docs/v2#pokemon)
 */
interface PokemonApis {
    suspend fun getPokemon(id: Identifier): Result<Pokemon>
    suspend fun getAbility(id: Identifier): Result<Ability>
    suspend fun getPokemonSpecies(id: Identifier): Result<PokemonSpecies>
    suspend fun getPokemonColor(id: Identifier): Result<PokemonColor>
    suspend fun getPokemonForm(id: Identifier): Result<PokemonForm>
    suspend fun getPokemonHabitat(id: Identifier): Result<PokemonHabitat>
    suspend fun getPokemonShape(id: Identifier): Result<PokemonShape>
    suspend fun getStat(id: Identifier): Result<Stat>
    suspend fun getCharacteristic(id: Identifier): Result<Characteristic>
    suspend fun getEggGroup(id: Identifier): Result<EggGroup>
    suspend fun getGender(id: Identifier): Result<Gender>
    suspend fun getGrowthRate(id: Identifier): Result<GrowthRate>
    suspend fun getNature(id: Identifier): Result<Nature>
    suspend fun getPokeathlonStat(id: Identifier): Result<PokeathlonStat>
    suspend fun getPokemonLocationArea(id: Identifier): Result<List<LocationAreaEncounter>>
    suspend fun getType(id: Identifier): Result<Type>

    companion object
}

internal class PokemonRemoteApis(private val baseApi: BaseApi) : PokemonApis {
    override suspend fun getAbility(id: Identifier): Result<Ability> = baseApi.fetch("/ability/$id")
    override suspend fun getCharacteristic(id: Identifier): Result<Characteristic> =
        baseApi.fetch("/characteristic/$id")

    override suspend fun getEggGroup(id: Identifier): Result<EggGroup> =
        baseApi.fetch("/egg-group/$id")

    override suspend fun getGender(id: Identifier): Result<Gender> = baseApi.fetch("/gender/$id")
    override suspend fun getGrowthRate(id: Identifier): Result<GrowthRate> =
        baseApi.fetch("/growth-rate/$id")

    override suspend fun getNature(id: Identifier): Result<Nature> = baseApi.fetch("/nature/$id")
    override suspend fun getPokeathlonStat(id: Identifier): Result<PokeathlonStat> =
        baseApi.fetch("/pokeathlon-stat/$id")

    override suspend fun getPokemon(id: Identifier): Result<Pokemon> = baseApi.fetch("/pokemon/$id")
    override suspend fun getPokemonLocationArea(id: Identifier): Result<List<LocationAreaEncounter>> =
        baseApi.fetch("/pokemon/$id/encounters")

    override suspend fun getPokemonColor(id: Identifier): Result<PokemonColor> =
        baseApi.fetch("/pokemon-color/$id")

    override suspend fun getPokemonForm(id: Identifier): Result<PokemonForm> =
        baseApi.fetch("/pokemon-form/$id")

    override suspend fun getPokemonHabitat(id: Identifier): Result<PokemonHabitat> =
        baseApi.fetch("/pokemon-habitat/$id")

    override suspend fun getPokemonShape(id: Identifier): Result<PokemonShape> =
        baseApi.fetch("/pokemon-shape/$id")

    override suspend fun getPokemonSpecies(id: Identifier): Result<PokemonSpecies> =
        baseApi.fetch("/pokemon-species/$id")

    override suspend fun getStat(id: Identifier): Result<Stat> = baseApi.fetch("/stat/$id")
    override suspend fun getType(id: Identifier): Result<Type> = baseApi.fetch("/type/$id")
}