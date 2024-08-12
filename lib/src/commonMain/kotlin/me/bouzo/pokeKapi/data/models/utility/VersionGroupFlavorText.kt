package me.bouzo.pokeKapi.data.models.utility

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property text The localized name for an API resource in a specific language.
 * @property language The language this name is in.
 * @property versionGroup The version group which uses this flavor text.
 */
@Serializable
data class VersionGroupFlavorText(
    val text: String,
    val language: NamedAPIResource,
    @SerialName("version_group") val versionGroup: NamedAPIResource,
)