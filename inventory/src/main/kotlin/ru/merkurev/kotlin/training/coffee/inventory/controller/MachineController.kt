package ru.merkurev.kotlin.training.coffee.inventory.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.merkurev.kotlin.training.coffee.inventory.model.Location
import ru.merkurev.kotlin.training.coffee.inventory.model.Machine
import ru.merkurev.kotlin.training.coffee.inventory.model.Status

@RestController
class MachineController {

    @GetMapping("/machines")
    fun getMachines(): List<Machine> {
        return listOf(
            Machine(1L, Location(1, 1), Status.UTILIZATION),
            Machine(2L, Location(5, 5), Status.DEPLOYMENT),
            Machine(2L, Location(5, 5), Status.MAINTENANCE),
        )
    }
}