package me.bouzo.pokeKapi.data.models.pokemon.shape

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * @property awesomeName The localized "scientific" name for an API resource in a specific language.
 * @property language The language this "scientific" name is in.
 */
@Serializable
data class AwesomeName(
    @SerialName("awesome_name") val awesomeName: String,
    val language: NamedAPIResource,
)

/**
 * Shapes used for sorting Pokémon in a Pokédex.
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property awesomeNames The "scientific" name of this Pokémon shape listed in different languages.
 * @property names The name of this resource listed in different languages.
 * @property pokemonSpecies A list of the Pokémon species that have this shape.
 */
@Serializable
data class PokemonShape(
    val id: Int,
    val name: String,
    @SerialName("awesome_names") val awesomeNames: List<AwesomeName>,
    val names: List<Name>,
    @SerialName("pokemon_species") val pokemonSpecies: List<NamedAPIResource>,
)