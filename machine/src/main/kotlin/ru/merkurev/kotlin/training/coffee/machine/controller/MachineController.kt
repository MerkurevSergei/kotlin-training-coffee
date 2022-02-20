package ru.merkurev.kotlin.training.coffee.machine.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.merkurev.kotlin.training.coffee.machine.entity.MachineProgram

@RestController
class MachineController {

    @GetMapping("/machines")
    fun getMachines(): MachineProgram {
        return MachineProgram()
    }
}