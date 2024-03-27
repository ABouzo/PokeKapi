package me.bouzo.pokeKapi.data.models.pokemon.athlonStats

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * @property maxChange The maximum amount of change to the referenced Pokéathlon stat.
 * @property nature The nature causing the change.
 */
@Serializable
data class NaturePokeathlonStatAffect(
    @SerialName("max_change")
    val maxChange: Int,
    val nature: NamedApiResource,
)