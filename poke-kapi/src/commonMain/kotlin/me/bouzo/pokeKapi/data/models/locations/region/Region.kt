package me.bouzo.pokeKapi.data.models.locations.region

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Regions are the areas where Pokémon can be found. Each region has its own set of locations,
 * Pokémon, and Pokédexes.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#regions)
 *
 * @property id The identifier for this resource.
 * @property locations A list of locations that can be found in this region.
 * @property name The name for this resource.
 * @property names The name of this resource listed in different languages.
 * @property mainGeneration The generation this region was introduced in.
 * @property pokedexes A list of pokédexes that catalogue Pokémon in this region.
 * @property versionGroups A list of version groups where this region can be visited.
 */
@Serializable
data class Region(
    val id: Int,
    val locations: List<NamedAPIResource>,
    val name: String,
    val names: List<Name>,
    @SerialName("main_generation") val mainGeneration: NamedAPIResource,
    val pokedexes: List<NamedAPIResource>,
    @SerialName("version_groups") val versionGroups: List<NamedAPIResource>
)