import com.android.build.gradle.AppExtension
import com.android.build.gradle.AppPlugin
import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.LibraryPlugin
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.kotlin.kapt) apply false
    alias(libs.plugins.dagger.hilt.android).apply(false)
    alias(libs.plugins.ksp).apply(false)
    alias(libs.plugins.android.library) apply false
}

fun BaseExtension.defaultConfig() {
    compileSdkVersion(35)

    buildFeatures.apply {
        compose = true
        buildConfig = true
    }

    defaultConfig {
        minSdk = 24
        targetSdk = 34
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        vectorDrawables {
            useSupportLibrary = true
        }

        buildConfigField("String", "API_KEY", "\"538c416021af406d9d75dc4c04c93267\"")
        buildConfigField("String", "BASE_URL", "\"https://newsapi.org/v2/\"")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.12"
    }
    buildTypes {
        getByName("debug") {
            isTestCoverageEnabled = true
        }
    }
    packagingOptions {
        resources {
            excludes += "META-INF/gradle/incremental.annotation.processors"
        }
    }
}

fun PluginContainer.applyDefaultConfig(project: Project) {
    whenPluginAdded {
        when (this) {
            is AppPlugin -> {
                project.extensions.getByType<AppExtension>().apply {
                    defaultConfig()
                }
            }

            is LibraryPlugin -> {
                project.extensions.getByType<LibraryExtension>().apply {
                    defaultConfig()
                }
            }

            is JavaPlugin -> {
                project.extensions.getByType<org.gradle.api.plugins.JavaPluginExtension>().apply {
                    sourceCompatibility = JavaVersion.VERSION_11
                    targetCompatibility = JavaVersion.VERSION_11
                }
            }
        }
    }
}

subprojects {
    plugins.applyDefaultConfig(this)

    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = "11"
            freeCompilerArgs += listOf(
                "-opt-in=kotlin.RequiresOptIn",
                "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
                "-opt-in=kotlinx.coroutines.FlowPreview",
                "-opt-in=androidx.compose.ui.ExperimentalComposeUiApi",
                "-opt-in=androidx.compose.material.ExperimentalMaterialApi"
            )
        }
    }
}
