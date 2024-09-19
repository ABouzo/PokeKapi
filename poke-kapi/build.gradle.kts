import com.vanniktech.maven.publish.SonatypeHost
import kotlin.math.sign

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
//    alias(libs.plugins.sqlDelight)
    alias(libs.plugins.kotlinxSerialization)
    alias(libs.plugins.researchgate.release)
    alias(libs.plugins.vanniktech.maven.publish)
}

group = "me.bouzo"
kotlin {

    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    jvm()
    js {
        browser {
            testTask {
                useKarma {
                    useChromeHeadless()
                    useFirefoxHeadless()
                }
            }
        }
        nodejs()
    }
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

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    signAllPublications()
    pom {
        name = "PokeKapi Wrapper"
        description = "A Kotlin Multiplaform Wrapper for Pokeapi"
        inceptionYear = "2024"
        url = "https://github.com/ABouzo/PokeKapi"
        licenses {
            license {
                name.set("The Apache License, Version 2.0")
                url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                distribution.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
            }
        }
        developers {
            developer {
                id = "ABouzo"
                name = "Angel Bouzo"
                url = "https://github.com/ABouzo"
            }
        }
        scm {
            url = "https://github.com/ABouzo/PokeKapi"
            connection = "scm:git:git://github.com:ABouzo/PokeKapi.git"
            developerConnection = "scm:git:ssh://git@github.com:ABouzo/PokeKapi.git"
        }
    }
}

release {
    git {
        requireBranch = "release"
    }
}

//sqldelight {
//    databases {
//        create("PokeDB") {
//            packageName.set("me.bouzo.pokeKapi")
//        }
//    }
//}