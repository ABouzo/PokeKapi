package me.bouzo.pokeKapi.data.models.items.pockets

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Pockets within the players bag used for storing items by category.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#item-pockets)
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property categories A list of item categories that are relevant to this item pocket.
 * @property names The name of this resource listed in different languages.
 */
@Serializable
data class ItemPocket(
    val id: Int,
    val name: String,
    val categories: List<NamedAPIResource>,
    val names: List<Name>
)