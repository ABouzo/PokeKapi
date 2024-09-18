package me.bouzo.pokeKapi.data.models.utility

import kotlinx.serialization.Serializable

/**
 * @property name The name of the referenced resource.
 * @property url The URL of the referenced resource.
 */
@Serializable
data class NamedAPIResource(
    val name: String, override val url: String
) : RemoteResource {
    constructor(name: String, id: Int, category: String) : this(name, resourceUrl(id, category))
}