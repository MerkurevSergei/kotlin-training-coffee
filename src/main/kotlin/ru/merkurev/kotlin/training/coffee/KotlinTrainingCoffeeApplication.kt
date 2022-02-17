package ru.merkurev.kotlin.training.coffee

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinTrainingCoffeeApplication

fun main(args: Array<String>) {
	runApplication<KotlinTrainingCoffeeApplication>(*args)
}
