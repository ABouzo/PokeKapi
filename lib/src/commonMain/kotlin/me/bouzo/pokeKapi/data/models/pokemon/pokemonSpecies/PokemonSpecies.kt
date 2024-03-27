package me.bouzo.pokeKapi.data.models.pokemon.pokemonSpecies

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.ApiResource
import me.bouzo.pokeKapi.data.models.utility.Description
import me.bouzo.pokeKapi.data.models.utility.FlavorText
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are
 * shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam
 * is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy
 * and Wormadam-Plant.
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property order The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
 * @property genderRate The chance of this Pokémon being female, in eighths; or -1 for genderless.
 * @property captureRate The base capture rate; up to 255. The higher the number, the easier the catch.
 * @property baseHappiness The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
 * @property isBaby Whether or not this is a baby Pokémon.
 * @property isLegendary Whether or not this is a legendary Pokémon.
 * @property isMythical Whether or not this is a mythical Pokémon.
 * @property hatchCounter Initial hatch counter: one must walk 255 × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's.
 * @property hasGenderDifferences Whether or not this Pokémon has visual gender differences.
 * @property formsSwitchable Whether or not this Pokémon has multiple forms and can switch between them.
 * @property growthRate The rate at which this Pokémon species gains levels.
 * @property pokedexNumbers A list of Pokedexes and the indexes reserved within them for this Pokémon species.
 * @property eggGroups A list of egg groups this Pokémon species is a member of.
 * @property color The color of this Pokémon for Pokédex search.
 * @property shape The shape of this Pokémon for Pokédex search.
 * @property evolvesFromSpecies The Pokémon species that evolves into this Pokemon_species.
 * @property evolutionChain The evolution chain this Pokémon species is a member of.
 * @property habitat The habitat this Pokémon species can be encountered in.
 * @property generation The generation this Pokémon species was introduced in.
 * @property names The name of this resource listed in different languages.
 * @property palParkEncounters A list of encounters that can be had with this Pokémon species in pal park.
 * @property flavorTextEntries A list of flavor text entries for this Pokémon species.
 * @property formDescriptions Descriptions of different forms Pokémon take on within the Pokémon species.
 * @property genera The genus of this Pokémon species listed in multiple languages.
 * @property varieties A list of the Pokémon that exist within this Pokémon species.
 */
@Serializable
data class PokemonSpecies(
    val id: Int,
    val name: String,
    val order: Int,
    @SerialName("gender_rate")
    val genderRate: Int,
    @SerialName("capture_rate")
    val captureRate: Int,
    @SerialName("base_happiness")
    val baseHappiness: Int,
    @SerialName("is_baby")
    val isBaby: Boolean,
    @SerialName("is_legendary")
    val isLegendary: Boolean,
    @SerialName("is_mythical")
    val isMythical: Boolean,
    @SerialName("hatch_counter")
    val hatchCounter: Int,
    @SerialName("has_gender_differences")
    val hasGenderDifferences: Boolean,
    @SerialName("forms_switchable")
    val formsSwitchable: Boolean,
    @SerialName("growth_rate") val growthRate: NamedApiResource,
    @SerialName("pokedex_numbers") val pokedexNumbers: List<PokemonSpeciesDexEntry>,
    @SerialName("egg_groups") val eggGroups: List<NamedApiResource>,
    val color: NamedApiResource,
    val shape: NamedApiResource,
    @SerialName("evolves_from_species") val evolvesFromSpecies: NamedApiResource,
    @SerialName("evolution_chain") val evolutionChain: ApiResource,
    val habitat: NamedApiResource,
    val generation: NamedApiResource,
    val names: List<Name>,
    @SerialName("pal_park_encounters") val palParkEncounters: List<PalParkEncounterArea>,
    @SerialName("flavor_text_entries") val flavorTextEntries: List<FlavorText>,
    @SerialName("form_descriptions") val formDescriptions: List<Description>,
    val genera: List<Genus>,
    val varieties: List<PokemonSpeciesVariety>,
)