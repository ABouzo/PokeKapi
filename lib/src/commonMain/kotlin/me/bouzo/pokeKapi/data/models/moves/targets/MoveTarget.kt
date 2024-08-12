package me.bouzo.pokeKapi.data.models.moves.targets

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Description
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Targets moves can be directed at during battle. Targets can be Pokémon, environments or
 * even other moves.
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property descriptions The description of this resource listed in different languages.
 * @property moves A list of moves that that are directed at this target.
 * @property names The name of this resource listed in different languages.
 */
@Serializable
data class MoveTarget(
    val id: Int,
    val name: String,
    val descriptions: List<Description>,
    val moves: List<NamedAPIResource>,
    val names: List<Name>
)