package me.bouzo.pokeKapi.data.models.moves.move

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * @property ailment The status ailment this move inflicts on its target.
 * @property category The category of move this move falls under, e.g. damage or ailment.
 * @property minHits The minimum number of times this move hits. Null if it always only hits once.
 * @property maxHits The maximum number of times this move hits. Null if it always only hits once.
 * @property minTurns The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
 * @property maxTurns The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
 * @property drain HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
 * @property healing The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.
 * @property critRate Critical hit rate bonus.
 * @property ailmentChance The likelihood this attack will cause an ailment.
 * @property flinchChance The likelihood this attack will cause the target Pokémon to flinch.
 * @property statChance The likelihood this attack will cause a stat change in the target Pokémon.
 */
@Serializable
data class MoveMetaData(
    val ailment: NamedAPIResource,
    val category: NamedAPIResource,
    @SerialName("min_hits") val minHits: Int?,
    @SerialName("max_hits") val maxHits: Int?,
    @SerialName("min_turns") val minTurns: Int?,
    @SerialName("max_turns") val maxTurns: Int?,
    val drain: Int,
    val healing: Int,
    @SerialName("crit_rate") val critRate: Int,
    @SerialName("ailment_chance") val ailmentChance: Int,
    @SerialName("flinch_chance") val flinchChance: Int,
    @SerialName("stat_chance") val statChance: Int
)