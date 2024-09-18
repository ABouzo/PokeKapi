package me.bouzo.pokeKapi.data.models.encounters.conditions

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#encounter-conditions)
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property names The name of this resource listed in different languages.
 * @property values A list of possible values for this encounter condition.
 */
@Serializable
data class EncounterCondition(
    val id: Int,
    val name: String,
    val names: List<Name>,
    val values: List<NamedAPIResource>
)