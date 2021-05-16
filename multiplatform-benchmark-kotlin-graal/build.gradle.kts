import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.32"
    id("com.github.johnrengelman.shadow").version("7.0.0")
    application
}

group = "de.tfr.sample"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

application() {
    applicationName = "BenchMark"
    mainClass.set("de.tfr.BenchMarkKt")
}

dependencies {
    implementation ("org.jetbrains.kotlin:kotlin-stdlib")
    implementation ("de.tfr.sample:multiplatform-benchmark-tests-jvm:1.0-SNAPSHOT")
    testImplementation( "org.junit.jupiter:junit-jupiter-api:5.7.0")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}

tasks.test {
    useJUnitPlatform()
}


// Configure Shadow to output with normal jar file name:
tasks.named<ShadowJar>("shadowJar").configure {
    minimize()
}

tasks {
    build {
        dependsOn(shadowJar)
    }
}