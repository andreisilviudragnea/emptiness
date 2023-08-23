plugins {
    kotlin("jvm") version "1.9.10"
    id("org.jlleitschuh.gradle.ktlint") version "11.5.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("io.projectreactor:reactor-core:3.5.9")
    implementation("io.reactivex.rxjava3:rxjava:3.1.7")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
}

kotlin {
    jvmToolchain(17)
}
