plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.dagger.hilt.android)
    alias(libs.plugins.kotlin.kapt)


}


android {
    namespace = "com.sample.assesmentapp"

    defaultConfig {
        applicationId = "com.sample.assesmentapp"
        versionCode = 1
        versionName = "1.0"
    }


}

dependencies {

    implementation(platform(libs.compose.bom))
    implementation(libs.compose.foundation)
    implementation(libs.compose.ui)
    implementation(libs.compose.runtime)
    implementation(libs.material3Android)
    implementation(libs.activity.compose)
    implementation(libs.navigation.compose)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.ui.tooling.preview.android)
    //Modules
    implementation(project(":core"))
    implementation(project(":presentation"))
    implementation(project(":data"))
    implementation(project(":domain"))
    //Hilt Dependency Injection
    implementation(libs.hilt.android)
    kapt(libs.hilt.compile.android)
    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.gson)
    implementation(libs.okhttp.logging)
    implementation(libs.gson)
    // Coroutines
    implementation(libs.coroutines.core)
    implementation(libs.coroutines.android)
    // Hilt Dependency Injection
    implementation(libs.hilt.android)
    kapt(libs.hilt.compile.android)
    implementation(libs.hilt.navigation.compose)
    //Testing dependencies
    testImplementation(libs.coroutines.test)
    testImplementation(libs.mockito.core)
    testImplementation(libs.mockito.kotlin)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}