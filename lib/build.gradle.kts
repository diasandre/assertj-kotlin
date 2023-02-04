plugins {
    id("org.jetbrains.kotlin.jvm") version "1.7.10"
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.1")
    implementation("org.assertj:assertj-core:3.24.2")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
