package me.bouzo.pokeKapi.data.models.items.flingEffects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Effect
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

@Serializable
data class ItemFlingEffect(
    val id: Int,
    val name: String,
    @SerialName("effect_entries") val effectEntries: List<Effect>,
    val items: List<NamedAPIResource>
)