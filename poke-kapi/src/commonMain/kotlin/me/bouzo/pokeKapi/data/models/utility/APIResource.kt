package me.bouzo.pokeKapi.data.models.utility

import kotlinx.serialization.Serializable

/**
 * @property url The URL of the referenced resource.
 */
@Serializable
data class APIResource(
    override val url: String
) : RemoteResource {
    constructor(id: Int, category: String) : this(resourceUrl(id, category))
}

