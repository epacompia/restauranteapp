plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.arlandatec.restauranteapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.arlandatec.restauranteapp"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.firebase.auth)
<<<<<<< HEAD
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
=======

    implementation ("com.google.firebase:firebase-bom:31.5.0")
    implementation ("com.google.android.gms:play-services-auth:20.5.0")


>>>>>>> 3e15e383b83dd1ca81871faf8bc608bb153a2d4f
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

<<<<<<< HEAD
    implementation ("com.google.firebase:firebase-bom:31.5.0")
    implementation ("com.google.android.gms:play-services-auth:20.5.0")

    // Retrofit and Gson dependencies
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.google.code.gson:gson:2.8.7")

    // RecyclerView dependency
    implementation ("androidx.recyclerview:recyclerview:1.2.1")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")


    testImplementation("junit:junit:4.13.2")
=======
>>>>>>> 3e15e383b83dd1ca81871faf8bc608bb153a2d4f
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}