import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.ir.backend.js.compile

plugins {
	id("org.springframework.boot") version "2.7.14-SNAPSHOT"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
	kotlin("jvm") version "1.6.21"
	kotlin("plugin.spring") version "1.6.21"
	kotlin("plugin.jpa") version "1.6.21"
}

group = "com.ojo.backend"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_11
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
	maven { url = uri("https://repo.spring.io/snapshot") }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.springframework.boot:spring-boot-starter-validation")
//	implementation("org.springdoc:springdoc-openapi-ui:1.6.15")

	implementation("mysql:mysql-connector-java:8.0.33")
//	implementation("org.springdoc:spring-boot-springdoc:3.1.2")
//	implementation("org.springdoc:spring-boot-springdoc:3.1.2")
//	implementation("org.springdoc:springdoc-openapi-core:1.1.49")
//	implementation("org.springdoc:spring-boot-springdoc:3.1.2")
//	implementation("org.springdoc:springdoc-openapi-core:1.1.49")
	// springfox swagger
//	implementation("io.springfox:springfox-swagger2:2.9.2")
//	implementation("io.springfox:springfox-swagger-ui:2.9.2")

	// springdocs
	implementation("org.springdoc:springdoc-openapi-ui:1.6.3")

	compileOnly("org.projectlombok:lombok")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	runtimeOnly("com.mysql:mysql-connector-j")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
