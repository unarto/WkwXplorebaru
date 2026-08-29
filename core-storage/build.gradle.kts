// [Jalur Class]: core-storage/build.gradle.kts
// [Penjelasan]: Menambahkan plugin KSP serta dependensi Room Database dan MMKV untuk penyimpanan lokal terstruktur.
plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.google.devtools.ksp)
}

android {
  namespace = "com.wakwau.xplore.storage"
  compileSdk = 36

  defaultConfig {
    minSdk = 24
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildFeatures {
    aidl = true
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }
}

dependencies {
  api(project(":core"))
  api(project(":core-storage-api"))
  api(libs.shizuku.api)
  api(libs.shizuku.provider)
  api(libs.mmkv)
  api(libs.androidx.room.runtime)
  api(libs.androidx.room.ktx)
  ksp(libs.androidx.room.compiler)
  implementation(libs.kotlinx.coroutines.core)
  implementation(libs.kotlinx.coroutines.android)
  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.documentfile)
  testImplementation(libs.junit)
  testImplementation(libs.kotlinx.coroutines.test)
}

