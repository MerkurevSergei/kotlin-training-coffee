package ru.merkurev.kotlin.training.coffee.inventory.model

/**
 * Кофемашина.
 *
 * Основной объект-агрегат, используется для хранения информации о
 * местоположении и статусе кофемашины.
 */
data class Machine(val id: Long, val location: Location, val status: Status)