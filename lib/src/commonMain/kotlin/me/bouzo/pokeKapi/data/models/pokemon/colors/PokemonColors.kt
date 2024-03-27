package me.bouzo.pokeKapi.data.models.pokemon.colors

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the
 * color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are
 * primarily orange are listed as red or brown.
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property names The name of this resource listed in different languages.
 * @property pokemonSpecies A list of the Pokémon species that have this color.
 */
@Serializable
data class PokemonColor(
    val id: Int,
    val name: String,
    val names: List<Name>,
    @SerialName("pokemon_species") val pokemonSpecies: List<NamedApiResource>
)