package me.bouzo.pokeKapi.data.models.items.attributes

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Description
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Item attributes define particular aspects of items, e.g. "usable in battle" or "consumable".
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#item-attributes)
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property items A list of items that have this attribute.
 * @property names The name of this item attribute listed in different languages.
 * @property descriptions The description of this item attribute listed in different languages.
 */
@Serializable
data class ItemAttribute(
    val id: Int,
    val name: String,
    val items: List<NamedAPIResource>,
    val names: List<Name>,
    val descriptions: List<Description>
)