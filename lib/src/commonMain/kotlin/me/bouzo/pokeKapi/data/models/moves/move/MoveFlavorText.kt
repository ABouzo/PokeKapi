package me.bouzo.pokeKapi.data.models.moves.move

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * @property flavorText The localized flavor text for an api resource in a specific language.
 * @property language The language this name is in.
 * @property versionGroup The version group that uses this flavor text.
 */
@Serializable
data class MoveFlavorText(
    @SerialName("flavor_text") val flavorText: String,
    val language: NamedApiResource,
    @SerialName("version_group") val versionGroup: NamedApiResource
)