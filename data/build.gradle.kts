plugins {
    kotlin("jvm")
    kotlin("kapt")

}
dependencies {
    implementation(project(":domain"))
    implementation(project(":core"))
   // Retrofit Networking
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.gson)
    // Coroutines
    implementation(libs.coroutines.core)
    //Dagger
    implementation(libs.hilt.core)
    kapt(libs.hilt.compiler)
    //Testing frame works
    testImplementation(libs.mockito.core)
    testImplementation(libs.mockito.kotlin)
    testImplementation(libs.coroutines.test)
    testImplementation(libs.turbine) // For Flow testing
    testImplementation(libs.mockito.kotlin)
    testImplementation(libs.mockk)
    testImplementation(libs.junit)


}
