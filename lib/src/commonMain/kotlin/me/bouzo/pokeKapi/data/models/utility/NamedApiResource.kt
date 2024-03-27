package me.bouzo.pokeKapi.data.models.utility

import kotlinx.serialization.Serializable

/**
 * @property name The name of the referenced resource.
 * @property url The URL of the referenced resource.
 */
@Serializable
data class NamedApiResource(
    val name: String, val url: String
)