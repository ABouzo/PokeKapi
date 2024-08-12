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