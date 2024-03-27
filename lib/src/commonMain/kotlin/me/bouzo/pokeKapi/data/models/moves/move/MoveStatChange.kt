package me.bouzo.pokeKapi.data.models.moves.move

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * @property change The amount of change.
 * @property stat The stat being affected.
 */
@Serializable
data class MoveStatChange(
    val change: Int,
    val stat: NamedApiResource
)