package me.bouzo.pokeKapi.data.models.utility

import kotlinx.serialization.Serializable

/**
 * @property url The URL of the referenced resource.
 */
@Serializable
data class APIResource(
    val url: String
)

