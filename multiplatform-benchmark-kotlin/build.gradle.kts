import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig.Mode.*

plugins {
    kotlin("multiplatform") version "1.4.32"
   //kotlin("multiplatform") version "1.5.0"
    `maven-publish`
}

group = "de.tfr.sample"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions{
                jvmTarget = "1.8"
            }
        }
        testRuns["test"].executionTask.configure {
            useJUnit()
        }
    }

    js(LEGACY) {
   //js() {
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
                mode = PRODUCTION
            }
        }
        binaries.executable()
    }
    val hostOs = System.getProperty("os.name")
    val isMingwX64 = hostOs.startsWith("Windows")
    val nativeTarget = when {
        hostOs == "Mac OS X" -> macosX64("native")
        hostOs == "Linux" -> linuxX64("native")
        isMingwX64 -> mingwX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }


    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val jvmMain by getting
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }
        val jsMain by getting
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
        val nativeMain by getting
        val nativeTest by getting
    }

    nativeTarget.apply {
        binaries {
            executable {
                entryPoint = "main"
            }
            test(listOf(RELEASE))
        }
    }
}

tasks.all {
    when (this) {
        is JavaForkOptions -> {
            jvmArgs("-Xms128m", "-Xmx12g") //now we can run tests with up to 12 GB memory
        }
    }
}
