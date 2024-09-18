package me.bouzo.pokeKapi.data.models.utility

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property flavorText The localized flavor text for an API resource in a specific language. Note
 * that this text is left unprocessed as it is found in game files. This means that it contains
 * special characters that one might want to replace with their visible decodable version. Please
 * check out this issue to find out more.
 * @property language The language this name is in.
 * @property version The game version this flavor text is extracted from.
 */
@Serializable
data class FlavorText(
    @SerialName("flavor_text") val flavorText: String,
    val language: NamedAPIResource,
    val version: NamedAPIResource,
)