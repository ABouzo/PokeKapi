package me.bouzo.pokeKapi.data.models.locations.location

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.GenerationGameIndex
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Locations that can be visited within the games. Locations make up sizable portions of regions,
 * like cities or routes.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#locations)
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property region The region this location can be found in.
 * @property names The name of this resource listed in different languages.
 * @property gameIndices A list of game indices relevant to this location by generation.
 * @property areas Areas that can be found within this location.
 */
@Serializable
data class Location(
    val id: Int,
    val name: String,
    val region: NamedAPIResource,
    val names: List<Name>,
    @SerialName("game_indices")
    val gameIndices: List<GenerationGameIndex>,
    val areas: List<NamedAPIResource>
)