package me.bouzo.pokeKapi.data.models.items.pockets

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

@Serializable
data class ItemPocket(
    val id: Int,
    val name: String,
    val categories: List<NamedAPIResource>,
    val names: List<Name>
)