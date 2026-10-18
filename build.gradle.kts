
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false

    // Safe Args for passing data between navigation destinations
    id("androidx.navigation.safeargs.kotlin") version "2.9.8" apply false
}
