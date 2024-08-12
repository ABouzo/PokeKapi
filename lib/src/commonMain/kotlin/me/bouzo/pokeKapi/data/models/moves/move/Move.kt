package me.bouzo.pokeKapi.data.models.moves.move

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.pokemon.abilities.AbilityEffectChange
import me.bouzo.pokeKapi.data.models.utility.APIResource
import me.bouzo.pokeKapi.data.models.utility.MachineVersionDetail
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource
import me.bouzo.pokeKapi.data.models.utility.VerboseEffect

/**
 * Represents a move that a Pokémon can learn.
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property accuracy The percent value of how likely this move is to be successful.
 * @property effectChance The percent value of how likely it is this moves effect will happen.
 * @property pp Power points. The number of times this move can be used.
 * @property priority A value between -8 and 8. Sets the order in which moves are executed during battle.
 * @property power The base power of this move with a value of 0 if it does not have a base power.
 * @property contestCombos A detail of normal and super contest combos that require this move.
 * @property contestType The type of appeal this move gives a Pokémon when used in a contest.
 * @property contestEffect The effect the move has when used in a contest.
 * @property damageClass The type of damage the move inflicts on the target, e.g. physical.
 * @property effectEntries The effect of this move listed in different languages.
 * @property effectChanges The list of previous effects this move has had across version groups of the games.
 * @property learnedByPokemon List of Pokemon that can learn the move.
 * @property flavorTextEntries The flavor text of this move listed in different languages.
 * @property generation The generation in which this move was introduced.
 * @property machines A list of the machines that teach this move.
 * @property meta Metadata about this move.
 * @property names The name of this resource listed in different languages.
 * @property pastValues A list of move resource value changes across version groups of the game.
 * @property statChanges A list of stats this moves effects and how much it effects them.
 * @property superContestEffect The effect the move has when used in a super contest.
 * @property target The type of target that will receive the effects of the attack.
 * @property type The elemental type of this move.
 */
@Serializable
data class Move(
    val id: Int,
    val name: String,
    val accuracy: Int?,
    @SerialName("effect_chance") val effectChance: Int?,
    val pp: Int,
    val priority: Int,
    val power: Int?,
    @SerialName("contest_combos") val contestCombos: ContestComboSets,
    @SerialName("contest_type") val contestType: NamedAPIResource,
    @SerialName("contest_effect") val contestEffect: APIResource,
    @SerialName("damage_class") val damageClass: NamedAPIResource,
    @SerialName("effect_entries") val effectEntries: List<VerboseEffect>,
    @SerialName("effect_changes") val effectChanges: List<AbilityEffectChange>,
    @SerialName("learned_by_pokemon") val learnedByPokemon: List<NamedAPIResource>,
    @SerialName("flavor_text_entries") val flavorTextEntries: List<MoveFlavorText>,
    val generation: NamedAPIResource,
    val machines: List<MachineVersionDetail>,
    val meta: MoveMetaData,
    val names: List<Name>,
    @SerialName("past_values") val pastValues: List<PastMoveStatValues>,
    @SerialName("stat_changes") val statChanges: List<MoveStatChange>,
    @SerialName("super_contest_effect") val superContestEffect: APIResource,
    val target: NamedAPIResource,
    val type: NamedAPIResource
)