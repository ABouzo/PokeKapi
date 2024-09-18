package me.bouzo.pokeKapi.data.models.pokemon.pokemon

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource
import me.bouzo.pokeKapi.data.models.utility.VersionGameIndex

/**
 * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using
 * Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species
 * but may take on a variant which makes it differ from other Pokémon of the same species, such as
 * base stats, available abilities and typings.
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property baseExperience The base experience gained for defeating this Pokémon.
 * @property height The height of this Pokémon in decimetres.
 * @property isDefault Set for exactly one Pokémon used as the default for each species.
 * @property order Order for sorting. Almost national order, except families are grouped together.
 * @property weight The weight of this Pokémon in hectograms.
 * @property abilities A list of abilities this Pokémon could potentially have.
 * @property forms A list of forms this Pokémon can take on.
 * @property game_indices A list of game indices relevent to Pokémon item by generation.
 * @property held_items A list of items this Pokémon may be holding when encountered.
 * @property location_area_encounters A link to a list of location areas, as well as encounter details pertaining to specific versions.
 * @property moves A list of moves along with learn methods and level details pertaining to specific version groups.
 * @property past_types A list of details showing types this pokémon had in previous generations
 * @property sprites A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at PokeAPI/sprites
 * @property cries A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at PokeAPI/cries
 * @property species The species this Pokémon belongs to.
 * @property stats A list of base stat values for this Pokémon.
 * @property types A list of details showing types this Pokémon has.
 */
@Serializable
data class Pokemon(
    val id: Int,
    val name: String,
    @SerialName("base_experience") val baseExperience: Int,
    val height: Int,
    @SerialName("is_default") val isDefault: Boolean,
    val order: Int,
    val weight: Int,
    val abilities: List<PokemonAbility>,
    val forms: List<NamedAPIResource>,
    val game_indices: List<VersionGameIndex>,
    val held_items: List<PokemonHeldItem>,
    val location_area_encounters: String,
    val moves: List<PokemonMove>,
    val past_types: List<PokemonTypePast>,
    val sprites: PokemonSprites,
    val cries: PokemonCries,
    val species: NamedAPIResource,
    val stats: List<PokemonStat>,
    val types: List<PokemonType>,
)

/**
 * @param isHidden Whether or not this is a hidden ability.
 * @param slot The slot this ability occupies in this Pokémon species.
 * @param ability The ability the Pokémon may have.
 */
@Serializable
data class PokemonAbility(
    @SerialName("is_hidden") val isHidden: Boolean, val slot: Int, val ability: NamedAPIResource
)


/**
 * @property slot The order the Pokémon's types are listed in.
 * @property type The type the referenced Pokémon has.
 */
@Serializable
data class PokemonType(
    val slot: Int, val type: NamedAPIResource
)

typealias PokemonFormType = PokemonType


/**
 * @property generation The last generation in which the referenced pokémon had the listed types.
 * @property types The types the referenced pokémon had up to and including the listed generation.
 */
@Serializable
data class PokemonTypePast(
    val generation: NamedAPIResource, val types: List<PokemonType>
)

/**
 * @property item The item the referenced Pokémon holds.
 * @property version_details The details of the different versions in which the item is held.
 */
@Serializable
data class PokemonHeldItem(
    val item: NamedAPIResource, val version_details: List<PokemonHeldItemVersion>
)

/**
 * @property version The version in which the item is held.
 * @property rarity How often the item is held.
 */
@Serializable
data class PokemonHeldItemVersion(
    val version: NamedAPIResource, val rarity: Int
)

/**
 * @property move The move the Pokémon can learn.
 * @property versionGroupDetails The details of the version in which the Pokémon can learn the move.
 */
@Serializable
data class PokemonMove(
    val move: NamedAPIResource,
    @SerialName("version_group_details") val versionGroupDetails: List<PokemonMoveVersion>
)

/**
 * @property moveLearnMethod The method by which the move is learned.
 * @property versionGroup The version group in which the move is learned.
 * @property levelLearnedAt The minimum level to learn the move.
 */
@Serializable
data class PokemonMoveVersion(
    @SerialName("move_learn_method") val moveLearnMethod: NamedAPIResource,
    @SerialName("version_group") val versionGroup: NamedAPIResource,
    @SerialName("level_learned_at") val levelLearnedAt: Int
)

/**
 * @property stat The stat the Pokémon has.
 * @property effort The effort points (EV) the Pokémon has in the stat.
 * @property baseStat The base value of the stat.
 */
@Serializable
data class PokemonStat(
    val stat: NamedAPIResource, val effort: Int, @SerialName("base_stat") val baseStat: Int
)

/**
 * @property frontDefault The default depiction of this Pokémon from the front in battle.
 * @property frontShiny The shiny depiction of this Pokémon from the front in battle.
 * @property frontFemale The female depiction of this Pokémon from the front in battle.
 * @property frontShinyFemale The shiny female depiction of this Pokémon from the front in battle.
 * @property backDefault The default depiction of this Pokémon from the back in battle.
 * @property backShiny The shiny depiction of this Pokémon from the back in battle.
 * @property backFemale The female depiction of this Pokémon from the back in battle.
 * @property backShinyFemale The shiny female depiction of this Pokémon from the back in battle.
 */
@Serializable
data class PokemonSprites(
    @SerialName("front_default") val frontDefault: String?,
    @SerialName("front_shiny") val frontShiny: String?,
    @SerialName("front_female") val frontFemale: String?,
    @SerialName("front_shiny_female") val frontShinyFemale: String?,
    @SerialName("back_default") val backDefault: String?,
    @SerialName("back_shiny") val backShiny: String?,
    @SerialName("back_female") val backFemale: String?,
    @SerialName("back_shiny_female") val backShinyFemale: String?
)

/**
 * @property latest The latest depiction of this Pokémon's cry.
 * @property legacy The legacy depiction of this Pokémon's cry.
 */
@Serializable
data class PokemonCries(
    val latest: String, val legacy: String
)