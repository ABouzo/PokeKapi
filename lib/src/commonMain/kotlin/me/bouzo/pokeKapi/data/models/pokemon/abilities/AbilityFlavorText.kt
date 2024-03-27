package me.bouzo.pokeKapi.data.models.pokemon.abilities

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * @property flavorText The localized name for an API resource in a specific language.
 * @property language The language this text resource is in.
 * @property versionGroup The version group that uses this flavor text.
 */
@Serializable
data class AbilityFlavorText(
    @SerialName("flavor_text") val flavorText: String,
    val language: NamedApiResource,
    @SerialName("version_group") val versionGroup: NamedApiResource
)