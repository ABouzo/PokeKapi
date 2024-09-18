package me.bouzo.pokeKapi.data.models.evolution.evolutionChains

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#evolution-chains)
 *
 * @property isBaby Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
 * @property species The Pokémon species at this point in the evolution chain.
 * @property evolutionDetails All details regarding the specific details of the referenced Pokémon species evolution.
 * @property evolvesTo A List of chain objects.
 */
@Serializable
data class ChainLink(
    @SerialName("is_baby") val isBaby: Boolean,
    val species: NamedAPIResource,
    @SerialName("evolution_details") val evolutionDetails: List<EvolutionDetail>,
    @SerialName("evolves_to") val evolvesTo: List<ChainLink>
)