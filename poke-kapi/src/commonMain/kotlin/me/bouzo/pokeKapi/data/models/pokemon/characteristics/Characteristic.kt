package me.bouzo.pokeKapi.data.models.pokemon.characteristics

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.Description
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResource

/**
 * Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic
 * is determined by the remainder of its highest IV divided by 5 (gene_modulo)
 * @property id The identifier for this resource.
 * @property geneModulo The remainder of the highest stat/IV divided by 5.
 * @property possibleValues The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
 * @property highestStat The stat which results in this characteristic.
 * @property descriptions The descriptions of this characteristic listed in different languages.
 */
@Serializable
data class Characteristic(
    val id: Int,
    @SerialName("gene_modulo") val geneModulo: Int,
    @SerialName("possible_values") val possibleValues: List<Int>,
    @SerialName("highest_stat") val highestStat: NamedAPIResource,
    val descriptions: List<Description>
)