package me.bouzo.pokeKapi.data.models.pokemon.stats

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * @property change The maximum amount of change to the referenced stat.
 * @property move The move causing the change.
 */
@Serializable
data class MoveStatAffect(
    val change: Int,
    val move: NamedAPIResource,
)