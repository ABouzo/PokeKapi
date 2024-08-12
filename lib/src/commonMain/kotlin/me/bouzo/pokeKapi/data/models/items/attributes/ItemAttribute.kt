package me.bouzo.pokeKapi.data.models.items.attributes

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Description
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

@Serializable
data class ItemAttribute(
    val id: Int,
    val name: String,
    val items: List<NamedAPIResource>,
    val names: List<Name>,
    val descriptions: List<Description>
)