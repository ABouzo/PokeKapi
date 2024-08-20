package me.bouzo.pokeKapi.data.models.encounters.methods

import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name

/**
 * Methods by which the player might encounter Pokémon in the wild, e.g., walking in tall grass.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#encounter-methods)
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property order A good value for sorting.
 * @property names The name of this resource listed in different languages.
 */
@Serializable
data class EncounterMethod(
    val id: Int,
    val name: String,
    val order: Int,
    val names: List<Name>
)