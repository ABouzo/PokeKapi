package me.bouzo.pokeKapi.data.models.moves.ailments

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * Move Ailments are status conditions caused by moves used during battle. See also
 * [status conditions](https://pokeapi.co/api/v2/move-ailment/).
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property moves A list of moves that cause this ailment.
 * @property names The name of this resource listed in different languages.
 */
@Serializable
data class MoveAilment(
    val id: Int,
    val name: String,
    val moves: List<NamedApiResource>,
    val names: List<Name>
)