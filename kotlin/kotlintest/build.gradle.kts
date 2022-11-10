plugins {
    kotlin("jvm") version "1.7.21"
    java
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.7.21")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.7.21")
    testImplementation("io.kotest:kotest-runner-junit5:5.5.4")
    testImplementation("io.kotest:kotest-property:5.5.4")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
}

java.sourceCompatibility = JavaVersion.VERSION_17

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
