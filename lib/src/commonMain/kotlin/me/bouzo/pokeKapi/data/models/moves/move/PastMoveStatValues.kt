package me.bouzo.pokeKapi.data.models.moves.move

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource
import me.bouzo.pokeKapi.data.models.utility.VerboseEffect

/**
 * @property accuracy The percent value of how likely this move is to be successful.
 * @property effectChance The percent value of how likely it is this moves effect will take effect.
 * @property power The base power of this move with a value of 0 if it does not have a base power.
 * @property pp Power points. The number of times this move can be used.
 * @property effectEntries The effect of this move listed in different languages.
 * @property type The elemental type of this move.
 * @property versionGroup The version group in which these move stat values were in effect.
 */
@Serializable
data class PastMoveStatValues(
    val accuracy: Int?,
    @SerialName("effect_chance") val effectChance: Int?,
    val power: Int?,
    val pp: Int,
    @SerialName("effect_entries") val effectEntries: List<VerboseEffect>,
    val type: NamedAPIResource,
    @SerialName("version_group") val versionGroup: NamedAPIResource
)