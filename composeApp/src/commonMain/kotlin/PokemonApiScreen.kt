import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ExposedDropdownMenuBox
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import me.bouzo.pokeKapi.PokeKapi
import me.bouzo.pokeKapi.data.models.name

private val PokeApi: PokeKapi = PokeKapi.create()
private val testData = MutableStateFlow("")
private val pokemonEndpoints = listOf(
    PokeApi::getAbility,
    PokeApi::getPokemonSpecies,
    PokeApi::getPokemonColor,
    PokeApi::getPokemonForm,
    PokeApi::getPokemonHabitat,
    PokeApi::getPokemonShape,
    PokeApi::getStat,
    PokeApi::getCharacteristic,
    PokeApi::getEggGroup,
    PokeApi::getGender,
    PokeApi::getGrowthRate,
    PokeApi::getNature,
    PokeApi::getPokeathlonStat,
    PokeApi::getPokemonLocationArea,
    PokeApi::getType
)

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PokemonApiScreen() {
    val collectedData by testData.collectAsState()
    var expanded: Boolean by remember { mutableStateOf(false) }
    var selectedValue: Int by remember { mutableStateOf(0) }
    var identifierName: String by remember { mutableStateOf("pikachu") }

    Column {
        Text(modifier = Modifier.fillMaxHeight(.7f), text = collectedData)
        Row(modifier = Modifier.fillMaxSize()) {
            TextField(
                modifier = Modifier.fillMaxSize(.5f),
                value = identifierName,
                onValueChange = { identifierName = it })
            ExposedDropdownMenuBox(
                modifier = Modifier.fillMaxWidth(.7f),
                expanded = expanded,
                onExpandedChange = { expanded = it }
            ) {
                Text(
                    pokemonEndpoints[selectedValue].toString().substringBefore('(')
                )
                ExposedDropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    pokemonEndpoints.forEachIndexed { index, func ->
                        DropdownMenuItem(onClick = {
                            selectedValue = index
                            expanded = false
                        }) {
                            Text(func.toString().substringBefore('('))
                        }
                    }
                }
            }
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    CoroutineScope(Dispatchers.IO).launch {
                        launch {
                            pokemonEndpoints[selectedValue](identifierName.name).onSuccess {
                                testData.emit(it.toString())
                            }.onFailure {
                                testData.emit(it.toString())
                            }
                        }
                    }
                }) {
                Text("Go")
            }
        }
    }
}