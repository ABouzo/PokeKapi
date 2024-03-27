package me.bouzo.pokeKapi.data.models.moves.damageClasses

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Description
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * Damage classes moves can have, e.g. physical, special, or non-damaging.
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property descriptions The description of this resource listed in different languages.
 * @property moves A list of moves that fall into this damage class.
 * @property names The name of this resource listed in different languages.
 */
@Serializable
data class MoveDamageClass(
    val id: Int,
    val name: String,
    val descriptions: List<Description>,
    val moves: List<NamedApiResource>,
    val names: List<Name>
)