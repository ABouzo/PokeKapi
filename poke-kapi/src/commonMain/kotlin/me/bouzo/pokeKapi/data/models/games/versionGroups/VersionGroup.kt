package me.bouzo.pokeKapi.data.models.games.versionGroups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Version groups categorize highly similar versions of the games.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#version-groups)
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property order Order for sorting. Almost by date of release, except similar versions are grouped together.
 * @property generation The generation this version was introduced in.
 * @property moveLearnMethods A list of methods in which Pokémon can learn moves in this version group.
 * @property pokedexes A list of Pokédexes introduces in this version group.
 * @property regions A list of regions that can be visited in this version group.
 * @property versions The versions this version group owns.
 */
@Serializable
data class VersionGroup(
    val id: Int,
    val name: String,
    val order: Int,
    val generation: NamedAPIResource,
    @SerialName("move_learn_methods") val moveLearnMethods: List<NamedAPIResource>,
    val pokedexes: List<NamedAPIResource>,
    val regions: List<NamedAPIResource>,
    val versions: List<NamedAPIResource>
)