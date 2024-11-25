plugins {
    kotlin("jvm") version "2.0.21"
    id("org.jlleitschuh.gradle.ktlint") version "12.1.2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("io.projectreactor:reactor-core:3.7.0")
    implementation("io.reactivex.rxjava3:rxjava:3.1.9")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0")
}
