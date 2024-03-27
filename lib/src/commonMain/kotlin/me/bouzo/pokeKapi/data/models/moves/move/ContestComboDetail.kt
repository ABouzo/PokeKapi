package me.bouzo.pokeKapi.data.models.moves.move

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.bouzo.pokeKapi.data.models.utility.NamedApiResource

/**
 * @property useBefore A list of moves to use before this move.
 * @property useAfter A list of moves to use after this move.
 */
@Serializable
data class ContestComboDetail(
    @SerialName("use_before") val useBefore: List<NamedApiResource>?,
    @SerialName("use_after") val useAfter: List<NamedApiResource>?
)