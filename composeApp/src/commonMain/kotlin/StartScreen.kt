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
    }
}