package me.bouzo.pokeKapi.data.models.pokemon.types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * @property slot The order the Pokémon's types are listed in.
 * @property pokemon The Pokémon that has the referenced type.
 */
@Serializable
data class TypePokemon(
    val slot: Int,
    @SerialName("pokemon") val pokemon: NamedAPIResource
)