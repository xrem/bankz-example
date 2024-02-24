plugins {
    id("java")
    id("io.freefair.lombok").version("8.6")
}

group = "ru.makarevich"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "ru.makarevich.banks.Program"
    }
}

tasks.test {
    useJUnitPlatform()
}

tasks.create<JavaExec>("amogus") {
    mainClass.set("ru.makarevich.banks.Program")
    classpath = sourceSets["main"].runtimeClasspath
}