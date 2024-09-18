package me.bouzo.pokeKapi.data.models.pokemon.abilities

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource
import me.bouzo.pokeKapi.data.models.utility.VerboseEffect

/**
 * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have
 * multiple possible abilities but can have only one ability at a time.
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property isMainSeries Whether or not this ability originated in the main series of the video games.
 * @property generation The generation this ability originated in.
 * @property names The name of this resource listed in different languages.
 * @property effectEntries The effect of this ability listed in different languages.
 * @property effectChanges The list of previous effects this ability has had across version groups.
 * @property flavorTextEntries The flavor text of this ability listed in different languages.
 * @property pokemon A list of Pokémon that could potentially have this ability.
 */
@Serializable
data class Ability(
    val id: Int,
    val name: String,
    @SerialName("is_main_series") val isMainSeries: Boolean,
    val generation: NamedAPIResource,
    val names: List<Name>,
    @SerialName("effect_entries") val effectEntries: List<VerboseEffect>,
    @SerialName("effect_changes") val effectChanges: List<AbilityEffectChange>,
    @SerialName("flavor_text_entries") val flavorTextEntries: List<AbilityFlavorText>,
    val pokemon: List<AbilityPokemon>,
)
