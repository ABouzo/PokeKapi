import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun App() {
    MaterialTheme {
        Surface(color = MaterialTheme.colors.background) {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = Screen.Start.name) {
                composable(Screen.Start.name) { StartScreen(navController::navigateTo) }
                composable(Screen.Pokemon.name) { PokemonApiScreen() }
            }
        }
    }
}

private fun NavHostController.navigateTo(navigation: Navigation) {
    when (navigation) {
        is Navigation.Back -> popBackStack()
        is Navigation.Route -> navigate(navigation.route.name)
    }
}


sealed class Navigation {
    data object Back : Navigation()
    data class Route(val route: Screen) : Navigation()
}

enum class Screen {
    Pokemon,
    Start
}