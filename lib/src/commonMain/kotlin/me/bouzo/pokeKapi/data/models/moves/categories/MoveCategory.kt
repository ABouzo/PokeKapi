package me.bouzo.pokeKapi.data.models.moves.categories

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Description
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource


/**
 * Very general categories that loosely group move effects
 * @property id The unique identifier for this move category.
 * @property name The name of this move category.
 * @property moves A list of moves that fall into this category.
 * @property descriptions The description of this resource listed in different languages.
 */
@Serializable
data class MoveCategory(
    val id: Int,
    val name: String,
    val moves: List<NamedAPIResource>,
    val descriptions: List<Description>
)