package me.bouzo.pokeKapi.data.models.games.version

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Versions of the games, e.g., Red, Blue or Yellow.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#version)
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property names The name of this resource listed in different languages.
 * @property versionGroup The version group this version belongs to.
 */
@Serializable
data class Version(
    val id: Int,
    val name: String,
    val names: List<Name>,
    @SerialName("version_group") val versionGroup: NamedAPIResource
)