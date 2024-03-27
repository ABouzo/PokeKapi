package me.bouzo.pokeKapi.data.models.pokemon.pokemonSpecies

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * @property entryNumber The index number within the Pokédex.
 * @property pokedex The Pokédex the referenced Pokémon species can be found in.
 */
@Serializable
data class PokemonSpeciesDexEntry(
    @SerialName("entry_number") val entryNumber: Int,
    val pokedex: NamedApiResource,
)