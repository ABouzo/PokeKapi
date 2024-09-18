package me.bouzo.pokeKapi.data.models.evolution.evolutionChains

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail
 * evolution conditions for each as well as Pokémon they can evolve into up through the highest stage.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#evolution-chains)
 *
 * @property id The identifier for this resource.
 * @property babyTriggerItem The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
 * @property chain The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.
 */
@Serializable
data class EvolutionChain(
    val id: Int,
    @SerialName("baby_trigger_item") val babyTriggerItem: NamedAPIResource? = null,
    val chain: ChainLink
)


