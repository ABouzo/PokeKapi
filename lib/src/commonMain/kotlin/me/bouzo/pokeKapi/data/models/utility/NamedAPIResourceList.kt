package me.bouzo.pokeKapi.data.models.utility

import kotlinx.serialization.Serializable

@Serializable
data class NamedAPIResourceList(
    val count: Int,
    val next: String? = null,
    val previous: String? = null,
    val results: List<NamedAPIResource>
)
