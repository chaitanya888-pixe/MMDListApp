plugins {
    kotlin("jvm")
}

dependencies {
    implementation(libs.coroutines.core)
   implementation(libs.javax.inject)
    //Dagger
    /*implementation(libs.hilt.core)
    kapt(libs.hilt.compiler)*/
    //Testing frame works
    testImplementation(libs.mockito.core)
    testImplementation(libs.mockito.kotlin)
    testImplementation(libs.coroutines.test)
    testImplementation(libs.turbine) // For Flow testing
    testImplementation(libs.mockito.kotlin)
    testImplementation(libs.mockk)
    testImplementation(libs.junit)

}