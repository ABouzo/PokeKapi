package me.bouzo.pokeKapi.data.models.items.categories

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

@Serializable
data class ItemCategory(
    val id: Int,
    val name: String,
    val items: List<NamedAPIResource>,
    val names: List<Name>,
    val pocket: NamedAPIResource
)