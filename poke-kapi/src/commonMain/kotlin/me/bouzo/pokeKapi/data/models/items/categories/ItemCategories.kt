package me.bouzo.pokeKapi.data.models.items.categories

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Item categories determine where items will be placed in the players bag.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#item-categories)
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property items A list of items that are a part of this category.
 * @property names The name of this item category listed in different languages.
 * @property pocket The pocket items in this category would be put in.
 */
@Serializable
data class ItemCategory(
    val id: Int,
    val name: String,
    val items: List<NamedAPIResource>,
    val names: List<Name>,
    val pocket: NamedAPIResource
)