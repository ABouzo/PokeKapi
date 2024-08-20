package me.bouzo.pokeKapi.data.models.games.pokedexes

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Pokémon entries within a specific Pokédex. See [PokeApi documentation](https://pokeapi.co/docs/v2#pokedexes)
 *
 * @property entryNumber The index of this Pokémon species entry within the Pokédex.
 * @property pokemonSpecies The Pokémon species being encountered.
 */
@Serializable
data class PokemonEntry(
    @SerialName("entry_number") val entryNumber: Int,
    @SerialName("pokemon_species") val pokemonSpecies: NamedAPIResource
)