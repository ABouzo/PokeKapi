package me.bouzo.pokeKapi.data.models.pokemon.natures

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * Natures influence how a Pokémon's stats grow.
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property decreasedStat The stat decreased by 10% in Pokémon with this nature.
 * @property increasedStat The stat increased by 10% in Pokémon with this nature.
 * @property hatesFlavor The flavor hated by Pokémon with this nature.
 * @property likesFlavor The flavor liked by Pokémon with this nature.
 * @property pokeathlonStatChanges A list of Pokéathlon stats this nature effects and how much it effects them.
 * @property moveBattleStylePreferences A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
 * @property names The name of this resource listed in different languages.
 */
@Serializable
data class Nature(
    val id: Int,
    val name: String,
    @SerialName("decreased_stat") val decreasedStat: NamedApiResource,
    @SerialName("increased_stat") val increasedStat: NamedApiResource,
    @SerialName("hates_flavor") val hatesFlavor: NamedApiResource,
    @SerialName("likes_flavor") val likesFlavor: NamedApiResource,
    @SerialName("pokeathlon_stat_changes") val pokeathlonStatChanges: List<NatureStatChange>,
    @SerialName("move_battle_style_preferences") val moveBattleStylePreferences: List<MoveBattleStylePreference>,
    val names: List<Name>
)
