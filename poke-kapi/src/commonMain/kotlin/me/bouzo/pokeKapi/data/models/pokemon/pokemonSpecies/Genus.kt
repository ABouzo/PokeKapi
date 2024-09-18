package me.bouzo.pokeKapi.data.models.pokemon.pokemonSpecies

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * @property genus The localized genus for the referenced Pokémon species
 * @property language The language this genus is in.
 */
@Serializable
data class Genus(
    val genus: String,
    val language: NamedAPIResource,
)