package me.bouzo.pokeKapi.data.models.utility

import me.bouzo.pokeKapi.data.models.Identifier
import me.bouzo.pokeKapi.data.network.BaseApi

interface RemoteResource {
    val url: String
}

private val RemoteResource.idInt: Int
    get() = url.split("/")[6].toInt()

val RemoteResource.identifier: Identifier.Id
    get() = Identifier.Id(idInt)

val RemoteResource.category: String
    get() = url.split("/")[5]

internal fun resourceUrl(id: Int, category: String): String = "${BaseApi.ROOT_ENDPOINT}/$category/$id"