plugins {
    kotlin("jvm")
}

dependencies {
    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.gson)
    implementation(libs.okhttp.logging)
    implementation(libs.gson)
    // Coroutines
    implementation(libs.coroutines.core)
  }

