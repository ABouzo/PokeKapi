import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ExposedDropdownMenuBox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.launch
import me.bouzo.pokeKapi.data.models.Identifier
import me.bouzo.pokeKapi.data.models.utility.NamedAPIResourceList
import me.bouzo.pokeKapi.data.models.utility.RemoteResource
import me.bouzo.pokeKapi.data.models.utility.RemoteResourceList
import me.bouzo.pokeKapi.data.models.utility.identifier


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PaginationApiScreen(
    endpoints: List<Pair<
            suspend (Int, Int) -> Result<RemoteResourceList<out RemoteResource>>,
            suspend (Identifier) -> Result<Any>
            >>
) {
    var collectedData: RemoteResourceList<*> by remember {
        mutableStateOf(
            NamedAPIResourceList(
                0, null, null, emptyList()
            ) as RemoteResourceList<*>
        )
    }
    var expanded: Boolean by remember { mutableStateOf(false) }
    var selectedValue: Int by remember { mutableStateOf(0) }

    LaunchedEffect(selectedValue) {
        endpoints[selectedValue].first.invoke(20, 0)
            .onSuccess { collectedData = it }
    }

    Column {
        LazyColumn(modifier = Modifier.fillMaxHeight(.9f)) {
            items(items = collectedData.results) { item ->
                Text(
                    modifier = Modifier.clickable {
                        CoroutineScope(Dispatchers.IO).launch {
                            endpoints[selectedValue].second(item.identifier).onSuccess {
                                println(it.toString())
                            }
                        }
                    },
                    text = item.toString(),
                )
            }
        }
        Row(modifier = Modifier.fillMaxSize()) {
            ExposedDropdownMenuBox(
                modifier = Modifier.fillMaxWidth(),
                expanded = expanded,
                onExpandedChange = { expanded = it }
            ) {
                Text(
                    endpoints[selectedValue].first.toString().substringBefore('(')
                )
                ExposedDropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    endpoints.forEachIndexed { index, (listFunc, _) ->
                        DropdownMenuItem(onClick = {
                            selectedValue = index
                            expanded = false
                        }) {
                            Text(listFunc.toString().substringBefore('('))
                        }
                    }
                }
            }
        }
    }
}