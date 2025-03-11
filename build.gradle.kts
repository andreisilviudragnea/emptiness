plugins {
    kotlin("jvm") version "2.1.10"
    id("org.jlleitschuh.gradle.ktlint") version "12.2.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("io.projectreactor:reactor-core:3.7.4")
    implementation("io.reactivex.rxjava3:rxjava:3.1.10")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.1")
}
