import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
    id("net.researchgate.release") version "2.8.1"
}

apply(from = "./gradle/release.gradle")

group = "com.mkacunha"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.register<Test>("unitTest") {
    useJUnitPlatform {
        excludeTags("mutation", "integration", "component")
    }
}

tasks.register<Test>("integrationTest") {
    useJUnitPlatform {
        excludeTags("mutation", "unit", "component")
    }
}

tasks.register<Test>("componentTest") {
    useJUnitPlatform {
        excludeTags("mutation", "integration", "unit")
    }
}

tasks.register<Test>("mutationTest") {
    useJUnitPlatform {
        excludeTags("unit", "integration", "component")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}