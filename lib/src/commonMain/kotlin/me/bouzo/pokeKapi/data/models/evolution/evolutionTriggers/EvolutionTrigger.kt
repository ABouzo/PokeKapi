package me.bouzo.pokeKapi.data.models.evolution.evolutionTriggers

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Evolution triggers are the events and conditions that cause a Pokémon to evolve.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#evolution-triggers)
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property names The name of this resource listed in different languages.
 * @property pokemonSpecies A list of pokemon species that result from this evolution trigger.
 */
@Serializable
data class EvolutionTrigger(
    val id: Int,
    val name: String,
    val names: List<Name>,
    @SerialName("pokemon_species") val pokemonSpecies: List<NamedAPIResource>
)