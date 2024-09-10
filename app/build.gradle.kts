plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.jsapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.jsapp"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.recyclerview:recyclerview:1.3.0")
    implementation("com.google.android.material:material:1.6.1")

    // Dependencias para pruebas unitarias
    testImplementation("junit:junit:4.13.2")

    // Dependencias para pruebas instrumentadas
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}