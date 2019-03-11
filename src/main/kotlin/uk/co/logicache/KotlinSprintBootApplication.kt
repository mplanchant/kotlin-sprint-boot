package uk.co.logicache

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSprintBootApplication

fun main(args: Array<String>) {
	runApplication<KotlinSprintBootApplication>(*args)
}
