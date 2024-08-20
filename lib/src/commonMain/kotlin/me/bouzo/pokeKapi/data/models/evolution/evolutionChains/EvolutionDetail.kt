package me.bouzo.pokeKapi.data.models.evolution.evolutionChains

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * All details regarding the specific details of the referenced Pokémon species evolution.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#evolution-chains)
 *
 * @property item The item required to cause evolution this into Pokémon species.
 * @property trigger The type of event that triggers evolution into this Pokémon species.
 * @property gender The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
 * @property heldItem The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
 * @property knownMove The move that must be known by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
 * @property knownMoveType The evolving Pokémon species must know a move with this type during the evolution trigger event in order to evolve into this Pokémon species.
 * @property location The location the evolution must be triggered at.
 * @property minLevel The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
 * @property minHappiness The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
 * @property minBeauty The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
 * @property minAffection The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
 * @property needsOverworldRain Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
 * @property partySpecies The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
 * @property partyType The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
 * @property relativePhysicalStats The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
 * @property timeOfDay The required time of day. Day or night.
 * @property tradeSpecies Pokémon species for which this one must be traded.
 * @property turnUpsideDown Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
 */
@Serializable
data class EvolutionDetail(
    val item: NamedAPIResource? = null,
    val trigger: NamedAPIResource,
    val gender: Int? = null,
    @SerialName("held_item") val heldItem: NamedAPIResource? = null,
    @SerialName("known_move") val knownMove: NamedAPIResource? = null,
    @SerialName("known_move_type") val knownMoveType: NamedAPIResource? = null,
    val location: NamedAPIResource? = null,
    @SerialName("min_level") val minLevel: Int? = null,
    @SerialName("min_happiness") val minHappiness: Int? = null,
    @SerialName("min_beauty") val minBeauty: Int? = null,
    @SerialName("min_affection") val minAffection: Int? = null,
    @SerialName("needs_overworld_rain") val needsOverworldRain: Boolean? = null,
    @SerialName("party_species") val partySpecies: NamedAPIResource? = null,
    @SerialName("party_type") val partyType: NamedAPIResource? = null,
    @SerialName("relative_physical_stats") val relativePhysicalStats: Int? = null,
    @SerialName("time_of_day") val timeOfDay: String? = null,
    @SerialName("trade_species") val tradeSpecies: NamedAPIResource? = null,
    @SerialName("turn_upside_down") val turnUpsideDown: Boolean? = null
)