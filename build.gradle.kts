plugins {
    kotlin("jvm") version "1.6.10"
    java
    kotlin("plugin.serialization") version "1.6.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly("org.projectlombok:lombok:1.18.24")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
