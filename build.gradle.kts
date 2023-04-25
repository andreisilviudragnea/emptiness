plugins {
    kotlin("jvm") version "1.8.21"
    id("org.jlleitschuh.gradle.ktlint") version "11.3.2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("io.projectreactor:reactor-core:3.5.5")
    implementation("io.reactivex.rxjava3:rxjava:3.1.6")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
}

kotlin {
    jvmToolchain(17)
}
