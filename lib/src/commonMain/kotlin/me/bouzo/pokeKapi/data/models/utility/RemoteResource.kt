package me.bouzo.pokeKapi.data.models.utility

import me.bouzo.pokeKapi.data.models.Identifier

interface RemoteResource {
    val url: String
}

private val RemoteResource.idInt: Int
    get() = url.split("/")[4].toInt()

val RemoteResource.identifier: Identifier
    get() = Identifier.Id(idInt)

val RemoteResource.category: String
    get() = url.split("/")[2]

internal fun resourceUrl(id: Int, category: String): String = "/api/v2/$category/$id"