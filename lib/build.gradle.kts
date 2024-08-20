import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
//    alias(libs.plugins.sqlDelight)
    alias(libs.plugins.kotlinxSerialization)
    `maven-publish`
}

kotlin {

    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    jvm()
    js().browser()
    js().nodejs()
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "pokeKapi"
            isStatic = true
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.kotlin.stdlib)
                implementation(libs.koin.core)
                implementation(libs.kotlinx.serialization.json)
                implementation(libs.ktor.client.core)
                implementation(libs.ktor.client.contentNegotiation)
                implementation(libs.ktor.serialization.kotlinx.json)
            }
        }
        jvmMain {
            dependencies {
                implementation(libs.ktor.client.okhttp)
            }
        }
        iosMain {
            dependencies {
                implementation(libs.ktor.client.darwin)
            }
        }
        jsMain {
            dependencies {
                implementation(libs.ktor.client.js)
            }
        }
        commonTest {
            dependencies {
                implementation(libs.kotlin.test)
                implementation(libs.benasher.uuid)
            }
        }
    }
}

android {
    namespace = "me.bouzo.pokeKapi"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

project.afterEvaluate {
    publishing {
        publications {
//            libraryProject(MavenPublication) {
//                groupId = "com.ruchiram4"
//                artifactId = "networking-release"
//                version = "1.0"
//                artifact bundleReleaseAar
//            }
        }
    }
}

//sqldelight {
//    databases {
//        create("PokeDB") {
//            packageName.set("me.bouzo.pokeKapi")
//        }
//    }
//}