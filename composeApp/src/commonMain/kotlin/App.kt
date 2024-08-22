import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import me.bouzo.pokeKapi.PokeKapi

private val PokeApi: PokeKapi = PokeKapi.create()

@Composable
fun App() {

    MaterialTheme {
        Surface(color = MaterialTheme.colors.background) {
            val navController = rememberNavController()
            Scaffold(
                topBar = {
                    TopAppBar(
                        navigationIcon = {
                            IconButton(
                                onClick = { navController.popBackStack(Screen.Start.name, inclusive = false) }
                            ) {
                                Icon(Icons.AutoMirrored.Filled.ArrowBack, "Navigate Back")
                            }
                        },
                        title = { Text("") }
                    )
                }
            ) {
                NavHost(navController = navController, startDestination = Screen.Start.name) {
                    composable(Screen.Start.name) { StartScreen(navController::navigateTo) }
                    composable(Screen.Pokemon.name) {
                        PaginationApiScreen(
                            listOf(
                                PokeApi::getPokemons to PokeApi::getPokemon,
                                PokeApi::getAbilities to PokeApi::getAbility,
                                PokeApi::getPokemonSpeciesList to PokeApi::getPokemonSpecies,
                                PokeApi::getPokemonColors to PokeApi::getPokemonColor,
                                PokeApi::getPokemonForms to PokeApi::getPokemonForm,
                                PokeApi::getPokemonHabitats to PokeApi::getPokemonHabitat,
                                PokeApi::getPokemonShapes to PokeApi::getPokemonShape,
                                PokeApi::getStats to PokeApi::getStat,
                                PokeApi::getCharacteristics to PokeApi::getCharacteristic,
                                PokeApi::getEggGroups to PokeApi::getEggGroup,
                                PokeApi::getGenders to PokeApi::getGender,
                                PokeApi::getGrowthRates to PokeApi::getGrowthRate,
                                PokeApi::getNatures to PokeApi::getNature,
                                PokeApi::getPokeathlonStats to PokeApi::getPokeathlonStat,
                                PokeApi::getTypes to PokeApi::getType
                            )
                        )
                    }
                    composable(Screen.Moves.name) {
                        PaginationApiScreen(
                            listOf(
                                PokeApi::getMoves to PokeApi::getMove,
                                PokeApi::getMoveAilments to PokeApi::getMoveAilment,
                                PokeApi::getMoveBattleStyles to PokeApi::getMoveBattleStyle,
                                PokeApi::getMoveCategories to PokeApi::getMoveCategory,
                                PokeApi::getMoveDamageClasses to PokeApi::getMoveDamageClass,
                                PokeApi::getMoveLearnMethods to PokeApi::getMoveLearnMethod,
                                PokeApi::getMoveTargets to PokeApi::getMoveTarget
                            )
                        )
                    }
                    composable(Screen.MachinesGamesEvolution.name) {
                        PaginationApiScreen(
                            listOf(
                                PokeApi::getMachines to PokeApi::getMachine,
                                PokeApi::getGenerations to PokeApi::getGeneration,
                                PokeApi::getPokedexes to PokeApi::getPokedex,
                                PokeApi::getVersions to PokeApi::getVersion,
                                PokeApi::getVersionGroups to PokeApi::getVersionGroup,
                                PokeApi::getEvolutionChains to PokeApi::getEvolutionChain,
                                PokeApi::getEvolutionTriggers to PokeApi::getEvolutionTrigger,
                            )
                        )
                    }
                    composable(Screen.Locations.name) {
                        PaginationApiScreen(
                            listOf(
                                PokeApi::getLocations to PokeApi::getLocation,
                                PokeApi::getLocationAreas to PokeApi::getLocationArea,
                                PokeApi::getPalParkAreas to PokeApi::getPalParkArea,
                                PokeApi::getRegions to PokeApi::getRegion
                            )
                        )
                    }
                    composable(Screen.Items.name) {
                        PaginationApiScreen(
                            listOf(
                                PokeApi::getItems to PokeApi::getItem,
                                PokeApi::getItemAttributes to PokeApi::getItemAttribute,
                                PokeApi::getItemCategories to PokeApi::getItemCategory,
                                PokeApi::getItemFlingEffects to PokeApi::getItemFlingEffect,
                                PokeApi::getItemPockets to PokeApi::getItemPocket,
                            )
                        )
                    }
                    composable(Screen.Encounters.name) {
                        PaginationApiScreen(
                            listOf(
                                PokeApi::getEncounterMethods to PokeApi::getEncounterMethod,
                                PokeApi::getEncounterConditions to PokeApi::getEncounterCondition,
                                PokeApi::getEncounterConditionValues to PokeApi::getEncounterConditionValue,
                            )
                        )
                    }
                    composable(Screen.ContestsBerries.name) {
                        PaginationApiScreen(
                            listOf(
                                PokeApi::getContestTypes to PokeApi::getContestType,
                                PokeApi::getContestEffects to PokeApi::getContestEffect,
                                PokeApi::getSuperContestEffects to PokeApi::getSuperContestEffect,
                                PokeApi::getBerries to PokeApi::getBerry,
                                PokeApi::getBerryFirmnesses to PokeApi::getBerryFirmness,
                                PokeApi::getBerryFlavors to PokeApi::getBerryFlavor
                            )
                        )
                    }
                }
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
    Pokemon, Start, Moves, MachinesGamesEvolution, Locations, Items, Encounters, ContestsBerries
}