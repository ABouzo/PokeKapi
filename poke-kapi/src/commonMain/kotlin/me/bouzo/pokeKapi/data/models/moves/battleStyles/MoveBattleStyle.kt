package me.bouzo.pokeKapi.data.models.moves.battleStyles

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name

/**
 * Styles of moves when used in the Battle Palace
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property names The name of this resource listed in different languages.
 */
@Serializable
data class MoveBattleStyle(
    val id: Int,
    val name: String,
    val names: List<Name>
)