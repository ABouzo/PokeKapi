package me.bouzo.pokeKapi.data.models.locations.locationArea

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Location areas are sections of areas, such as floors in a building or cave. Each area has its
 * own set of possible Pokémon encounters.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#location-areas)
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property gameIndex The internal id of an API resource within game data.
 * @property encounterMethodRates A list of methods in which Pokémon may be encountered in this
 * area and how likely the method will occur depending on the version of the game.
 * @property location The region this location area can be found in.
 * @property names The name of this resource listed in different languages.
 * @property pokemonEncounters A list of Pokémon that can be encountered in this area along with
 * version specific details about the encounter.
 */
@Serializable
data class LocationArea(
    val id: Int,
    val name: String,
    @SerialName("game_index") val gameIndex: Int,
    @SerialName("encounter_method_rates") val encounterMethodRates: List<EncounterMethodRate>,
    val location: NamedAPIResource,
    val names: List<Name>,
    @SerialName("pokemon_encounters") val pokemonEncounters: List<PokemonEncounter>
)