package me.bouzo.pokeKapi.data.models.pokemon.stats

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.ApiResource
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows
 * as they gain levels and can be altered momentarily by effects in battles.
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property game_index ID the games use for this stat.
 * @property is_battle_only Whether this stat only exists within a battle.
 * @property affecting_moves A detail of moves which affect this stat positively or negatively.
 * @property affecting_natures A detail of natures which affect this stat positively or negatively.
 * @property characteristics A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
 * @property move_damage_class The class of damage this stat is directly related to.
 * @property names The name of this resource listed in different languages.
 */
@Serializable
data class Stat(
    val id: Int,
    val name: String,
    @SerialName("game_index") val gameIndex: Int,
    @SerialName("is_battle_only") val isBattleOnly: Boolean,
    @SerialName("affecting_moves") val affectingMoves: MoveStatAffectSets,
    @SerialName("affecting_natures") val affectingNatures: NatureStatAffectSets,
    val characteristics: List<ApiResource>,
    @SerialName("move_damage_class") val moveDamageClass: NamedApiResource,
    val names: List<Name>,
)