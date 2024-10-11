package me.bouzo.pokeKapi.data.models

import me.bouzo.pokeKapi.data.createJsonConfig
import me.bouzo.pokeKapi.data.models.pokemon.abilities.Ability
import me.bouzo.pokeKapi.data.models.pokemon.athlonStats.PokeathlonStat
import me.bouzo.pokeKapi.data.models.pokemon.characteristics.Characteristic
import me.bouzo.pokeKapi.data.models.pokemon.colors.PokemonColor
import me.bouzo.pokeKapi.data.models.pokemon.egg.EggGroup
import me.bouzo.pokeKapi.data.models.pokemon.form.PokemonForm
import me.bouzo.pokeKapi.data.models.pokemon.gender.Gender
import me.bouzo.pokeKapi.data.models.pokemon.growth.GrowthRate
import me.bouzo.pokeKapi.data.models.pokemon.habitats.PokemonHabitat
import me.bouzo.pokeKapi.data.models.pokemon.location.LocationAreaEncounter
import me.bouzo.pokeKapi.data.models.pokemon.natures.Nature
import me.bouzo.pokeKapi.data.models.pokemon.pokemon.Pokemon
import me.bouzo.pokeKapi.data.models.pokemon.pokemonSpecies.PokemonSpecies
import me.bouzo.pokeKapi.data.models.pokemon.shape.PokemonShape
import me.bouzo.pokeKapi.data.models.pokemon.stats.Stat
import me.bouzo.pokeKapi.data.models.pokemon.types.Type
import kotlin.test.Test

class PokemonTest {
    private val json = createJsonConfig()

    @Test
    fun testPokemonDeserialization() {
        fromFile("pokemon/pokemon") {
            val pokemon = json.decodeFromString<Pokemon>(it)
            println(pokemon.name)
        }
    }

    @Test
    fun testPokemonType() {
        fromFile("pokemon/type") {
            val type = json.decodeFromString<Type>(it)
            println(type.name)
        }
    }

    @Test
    fun testPokemonStat() {
        fromFile("pokemon/stat") {
            val stat = json.decodeFromString<Stat>(it)
            println(stat.name)
        }
    }

    @Test
    fun testPokemonShape() {
        fromFile("pokemon/shape") {
            val shape = json.decodeFromString<PokemonShape>(it)
            println(shape.name)
        }
    }

    @Test
    fun testPokemonSpecies() {
        fromFile("pokemon/species") {
            val species = json.decodeFromString<PokemonSpecies>(it)
            println(species.name)
        }
    }

    @Test
    fun testPokemonNature() {
        fromFile("pokemon/nature") {
            val nature = json.decodeFromString<Nature>(it)
            println(nature.name)
        }
    }

    @Test
    fun testPokemonLocation() {
        fromFile("pokemon/location") {
            val location = json.decodeFromString<List<LocationAreaEncounter>>(it)
            location.forEach { println(it.locationArea.name) }
        }
    }

    @Test
    fun testPokemonHabitat() {
        fromFile("pokemon/habitat") {
            val habitat = json.decodeFromString<PokemonHabitat>(it)
            println(habitat.name)
        }
    }

    @Test
    fun testPokemonGrowth() {
        fromFile("pokemon/growth") {
            val growthRate = json.decodeFromString<GrowthRate>(it)
            println(growthRate.name)
        }
    }

    @Test
    fun testPokemonGender() {
        fromFile("pokemon/gender") {
            val gender = json.decodeFromString<Gender>(it)
            println(gender.name)
        }
    }

    @Test
    fun testPokemonForm() {
        fromFile("pokemon/form") {
            val form = json.decodeFromString<PokemonForm>(it)
            println(form.name)
        }
    }

    @Test
    fun testPokemonEggGroup() {
        fromFile("pokemon/egg") {
            val egg = json.decodeFromString<EggGroup>(it)
            println(egg.name)
        }
    }

    @Test
    fun testPokemonColor() {
        fromFile("pokemon/color") {
            val color = json.decodeFromString<PokemonColor>(it)
            println(color.name)
        }
    }

    @Test
    fun testPokemonCharacteristic() {
        fromFile("pokemon/characteristic") {
            val characteristic = json.decodeFromString<Characteristic>(it)
            println(characteristic.descriptions.find { it.language.name == "en" }?.description)
        }
    }

    @Test
    fun testPokemonPokeathlon() {
        fromFile("pokemon/pokeathlon") {
            val pokeathlon = json.decodeFromString<PokeathlonStat>(it)
            println(pokeathlon.name)
        }
    }

    @Test
    fun testPokemonAbility() {
        fromFile("pokemon/ability") {
            val ability = json.decodeFromString<Ability>(it)
            println(ability.name)
        }
    }
}