package me.bouzo.pokeKapi.data.models.games.generations

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Generations are the time periods when a new set of Pokémon and their associated content is released.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#generations)
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property abilities A list of abilities that were introduced in this generation.
 * @property names The name of this resource listed in different languages.
 * @property mainRegion The main region travelled in this generation.
 * @property moves A list of moves that were introduced in this generation.
 * @property pokemonSpecies A list of Pokémon species that were introduced in this generation.
 * @property types A list of types that were introduced in this generation.
 * @property versionGroups A list of version groups that were introduced in this generation.
 */
@Serializable
data class Generation(
    val id: Int,
    val name: String,
    val abilities: List<NamedAPIResource>,
    val names: List<Name>,
    @SerialName("main_region") val mainRegion: NamedAPIResource,
    val moves: List<NamedAPIResource>,
    @SerialName("pokemon_species") val pokemonSpecies: List<NamedAPIResource>,
    val types: List<NamedAPIResource>,
    @SerialName("version_groups") val versionGroups: List<NamedAPIResource>
)