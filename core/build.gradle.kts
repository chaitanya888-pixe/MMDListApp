import java.util.Properties

plugins {
    kotlin("jvm")
    kotlin("kapt")
}

val localProperties = Properties().apply {
    val file = rootProject.file("local.properties")
    if (file.exists()) {
        load(file.inputStream())
    }
}

val baseUrl = localProperties.getProperty("baseUrl") ?: ""
val apiKey = localProperties.getProperty("apiKey") ?: ""
val generatedDir = layout.buildDirectory.dir("generated/constants")


val generateConstants = tasks.register("generateConstants") {
    val outputDir = generatedDir.get().asFile
    outputs.dir(outputDir)

    doLast {
        val constantsFile = outputDir.resolve("com/sample/core/Constants.kt")
        constantsFile.parentFile.mkdirs()
        constantsFile.writeText(
            """
            package com.sample.core

            object Constants {
                const val BASE_URL = "$baseUrl"
                const val API_KEY = "$apiKey"
            }
            """.trimIndent()
        )
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    dependsOn(generateConstants)
}

tasks.withType<org.jetbrains.kotlin.gradle.internal.KaptGenerateStubsTask>().configureEach {
    dependsOn(generateConstants)
}

sourceSets {
    main {
        java.srcDir(generatedDir)
    }
}

dependencies {
    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.gson)
    implementation(libs.okhttp.logging)
    implementation(libs.gson)
    // Coroutines
    implementation(libs.coroutines.core)
    // Hilt
    implementation(libs.hilt.core)
    kapt(libs.hilt.compiler)
}
