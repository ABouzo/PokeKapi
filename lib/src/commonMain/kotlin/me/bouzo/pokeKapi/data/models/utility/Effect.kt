package me.bouzo.pokeKapi.data.models.utility

import kotlinx.serialization.Serializable

/**
 * @property effect The localized effect text for an API resource in a specific language.
 * @property language The language this effect is in.
 */
@Serializable
data class Effect(
    val effect: String, val language: NamedApiResource
)