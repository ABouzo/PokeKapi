package me.bouzo.pokeKapi.data.models.utility

import kotlinx.serialization.Serializable

/**
 * @property name The localized name for an API resource in a specific language.
 * @property language The language this name is in.
 */
@Serializable
data class Name(
    val name: String, val language: NamedApiResource
)