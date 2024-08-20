package me.bouzo.pokeKapi.data.models.encounters.conditionValues

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#encounter-condition-values)
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property condition The condition this encounter condition value pertains to.
 * @property names The name of this resource listed in different languages.
 */
@Serializable
data class EncounterConditionValue(
    val id: Int,
    val name: String,
    val condition: NamedAPIResource,
    val names: List<Name>
)