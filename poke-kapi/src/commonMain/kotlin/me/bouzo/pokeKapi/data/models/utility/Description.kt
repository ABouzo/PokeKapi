package me.bouzo.pokeKapi.data.models.utility

import kotlinx.serialization.Serializable

/**
 * @property description The localized description for an API resource in a specific language.
 * @property language The language this description is in.
 */
@Serializable
data class Description(
    val description: String, val language: NamedAPIResource
)