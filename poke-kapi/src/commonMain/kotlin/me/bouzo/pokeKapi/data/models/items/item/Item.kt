package me.bouzo.pokeKapi.data.models.items.item

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.APIResource
import me.bouzo.pokeKapi.data.models.utility.GenerationGameIndex
import me.bouzo.pokeKapi.data.models.utility.MachineVersionDetail
import me.bouzo.pokeKapi.data.models.utility.Name
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource
import me.bouzo.pokeKapi.data.models.utility.VerboseEffect
import me.bouzo.pokeKapi.data.models.utility.VersionGroupFlavorText

/**
 * An item is an object in the games which the player can pick up, keep in their bag, and use in
 * some manner. They have various uses, including healing, powering up, or evoking
 * various effects.
 * See [PokeApi documentation](https://pokeapi.co/docs/v2#item)
 *
 * @property id The identifier for this resource.
 * @property name The name for this resource.
 * @property cost The price of this item in stores.
 * @property flingPower The power of the move Fling when used with this item.
 * @property flingEffect The effect of the move Fling when used with this item.
 * @property attributes A list of attributes this item has.
 * @property category The category of items this item falls into.
 * @property effectEntries The effect of this ability listed in different languages.
 * @property flavorTextEntries The flavor text of this ability listed in different languages.
 * @property gameIndices A list of game indices relevent to this item by generation.
 * @property names The name of this item listed in different languages.
 * @property sprites A set of sprites used to depict this item in the game.
 * @property heldByPokemon A list of Pokémon that might be found in the wild holding this item.
 * @property babyTriggerFor An evolution chain this item requires to produce a baby during mating.
 * @property machines A list of the machines related to this item.
 */
@Serializable
data class Item(
    val id: Int,
    val name: String,
    val cost: Int,
    @SerialName("fling_power") val flingPower: Int? = null,
    @SerialName("fling_effect") val flingEffect: NamedAPIResource? = null,
    val attributes: List<NamedAPIResource>,
    val category: NamedAPIResource,
    @SerialName("effect_entries") val effectEntries: List<VerboseEffect>,
    @SerialName("flavor_text_entries") val flavorTextEntries: List<VersionGroupFlavorText>,
    @SerialName("game_indices") val gameIndices: List<GenerationGameIndex>,
    val names: List<Name>,
    val sprites: ItemSprites,
    @SerialName("held_by_pokemon") val heldByPokemon: List<ItemHolderPokemon>,
    @SerialName("baby_trigger_for") val babyTriggerFor: APIResource? = null,
    val machines: List<MachineVersionDetail>? = null
)

