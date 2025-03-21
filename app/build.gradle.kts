plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.carbooking"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.carbooking"
        minSdk = 26 // ลด minSdk เป็น 24 เพื่อรองรับอุปกรณ์มากขึ้น
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("com.google.android.material:material:1.6.0")
    // Firebase Firestore
    implementation("com.google.firebase:firebase-firestore:24.10.0")

    // Firebase Authentication
    implementation("com.google.firebase:firebase-auth-ktx")

    // Firebase Storage (หากต้องการอัปโหลดไฟล์หรือรูปภาพ)
    implementation("com.google.firebase:firebase-storage-ktx")

    // Firebase BOM (ช่วยให้ทุก Firebase SDK ใช้เวอร์ชันที่เข้ากันได้)
    implementation(platform("com.google.firebase:firebase-bom:32.7.0"))

    // AndroidX
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)


    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
