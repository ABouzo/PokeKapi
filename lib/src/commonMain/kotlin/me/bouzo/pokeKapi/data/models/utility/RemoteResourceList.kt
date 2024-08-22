package me.bouzo.pokeKapi.data.models.utility

interface RemoteResourceList<T: RemoteResource> {
    val count: Int
    val next: String?
    val previous: String?
    val results: List<T>
}