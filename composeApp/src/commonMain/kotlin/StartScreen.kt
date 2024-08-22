import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun StartScreen(navigation: (Navigation) -> Unit) {
    Column {
        Button(onClick = { navigation(Navigation.Route(Screen.Pokemon)) }) {
            Text(text = "Pokemon")
        }
        Button(onClick = { navigation(Navigation.Route(Screen.Moves)) }) {
            Text(text = "Move")
        }
        Button(onClick = { navigation(Navigation.Route(Screen.Locations)) }) {
            Text(text = "Locations")
        }
        Button(onClick = { navigation(Navigation.Route(Screen.Items)) }) {
            Text(text = "Items")
        }
        Button(onClick = { navigation(Navigation.Route(Screen.Encounters)) }) {
            Text(text = "Encounters")
        }
        Button(onClick = { navigation(Navigation.Route(Screen.ContestsBerries)) }) {
            Text(text = "Contest + Berries")
        }
        Button(onClick = { navigation(Navigation.Route(Screen.MachinesGamesEvolution)) }) {
            Text(text = "Machines + Games + Evolution")
        }
    }
}