package ru.merkurev.kotlin.training.coffee.machine

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MachineApplication

fun main(args: Array<String>) {
	runApplication<MachineApplication>(*args)
}
