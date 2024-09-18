package me.bouzo.pokeKapi.data.models.pokemon.natures

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * @property lowHpPreference Chance of using the move, in percent, if HP is under one half.
 * @property highHpPreference Chance of using the move, in percent, if HP is over one half.
 * @property moveBattleStyle The move battle style.
 */
@Serializable
data class MoveBattleStylePreference(
    @SerialName("low_hp_preference") val lowHpPreference: Int,
    @SerialName("high_hp_preference") val highHpPreference: Int,
    @SerialName("move_battle_style") val moveBattleStyle: NamedAPIResource
)