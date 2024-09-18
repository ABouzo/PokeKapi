package me.bouzo.pokeKapi.data.models.contests.types

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Contest Name
 *
 * @property name The name for this contest.
 * @property color The color associated with this contest's name.
 * @property language The language that this name is in.
 */
@Serializable
data class ContestName(
    val name: String,
    val color: String,
    val language: NamedAPIResource
)