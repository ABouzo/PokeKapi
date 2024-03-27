package me.bouzo.pokeKapi.data.models.pokemon.gender

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * @property rate The chance of this Pokémon being female, in eighths; or -1 for genderless.
 * @property pokemonSpecies A Pokémon species that can be the referenced gender.
 */
@Serializable
data class PokemonSpeciesGender(
    val rate: Int,
    @SerialName("pokemon_species") val pokemonSpecies: NamedApiResource
)