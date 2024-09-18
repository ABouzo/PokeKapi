package me.bouzo.pokeKapi.data.models.items.item

import kotlinx.serialization.Serializable

/**
 * A set of sprites used to depict this item in the game.
 *
 * @property default The default depiction of this item.
 */
@Serializable
data class ItemSprites(
    val default: String
)