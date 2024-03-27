package me.bouzo.pokeKapi.data.models.pokemon.form

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.pokemon.pokemon.PokemonFormType
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * Some Pokémon may appear in one of multiple, visually different forms. These differences are
 * purely cosmetic. For variations within a Pokémon species, which do differ in more than just
 * visuals, the 'Pokémon' entity is used to represent such a variety.
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property order The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
 * @property formOrder The order in which forms should be sorted within a species' forms.
 * @property isDefault True for exactly one form used as the default for each Pokémon.
 * @property isBattleOnly Whether or not this form can only happen during battle.
 * @property isMega Whether or not this form requires mega evolution.
 * @property formName The name of this form.
 * @property pokemon The Pokémon that can take on this form.
 * @property types A list of details showing types this Pokémon form has.
 * @property sprites A set of sprites used to depict this Pokémon form in the game.
 * @property versionGroup The version group this Pokémon form was introduced in.
 * @property names The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
 * @property formNames The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
 */
@Serializable
data class PokemonForm(
    val id: Int,
    val name: String,
    val order: Int,
    @SerialName("form_order") val formOrder: Int,
    @SerialName("is_default") val isDefault: Boolean,
    @SerialName("is_battle_only") val isBattleOnly: Boolean,
    @SerialName("is_mega") val isMega: Boolean,
    @SerialName("form_name") val formName: String,
    val pokemon: NamedApiResource,
    val types: List<PokemonFormType>,
    val sprites: PokemonFormSprites,
    @SerialName("version_group") val versionGroup: NamedApiResource,
    val names: List<Name>,
    @SerialName("form_names") val formNames: List<Name>,
)