package me.bouzo.pokeKapi.data.models.utility

import kotlinx.serialization.Serializable

@Serializable
data class APIResourceList(
    override val count: Int,
    override val next: String? = null,
    override val previous: String? = null,
    override val results: List<APIResource>
) : RemoteResourceList<APIResource>