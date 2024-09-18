package me.bouzo.pokeKapi.data.models.games.pokedexes

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Description
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and
 * retaining information on all known Pokémon. See [PokeApi documentation](https://pokeapi.co/docs/v2#pokedexes)
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property isMainSeries Whether or not this Pokédex originated in the main series of the video games.
 * @property descriptions The description of this resource listed in different languages.
 * @property names The name of this resource listed in different languages.
 * @property pokemonEntries A list of Pokémon catalogued in this Pokédex and their indexes.
 * @property region The region this Pokédex catalogues Pokémon for.
 * @property versionGroups A list of version groups this Pokédex is relevant to.
 */
@Serializable
data class Pokedex(
    val id: Int,
    val name: String,
    @SerialName("is_main_series") val isMainSeries: Boolean,
    val descriptions: List<Description>,
    val names: List<Name>,
    @SerialName("pokemon_entries") val pokemonEntries: List<PokemonEntry>,
    val region: NamedAPIResource,
    @SerialName("version_groups") val versionGroups: List<NamedAPIResource>
)

