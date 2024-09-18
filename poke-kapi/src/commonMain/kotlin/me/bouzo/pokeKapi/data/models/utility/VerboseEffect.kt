package me.bouzo.pokeKapi.data.models.utility

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property effect The localized effect text for an API resource in a specific language.
 * @property shortEffect The localized effect text in brief.
 * @property language The language this effect is in.
 */
@Serializable
data class VerboseEffect(
    val effect: String,
    @SerialName("short_effect") val shortEffect: String,
    val language: NamedAPIResource
)