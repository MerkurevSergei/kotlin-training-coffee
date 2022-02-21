package ru.merkurev.kotlin.training.coffee.inventory.model

/**
 * Состояние кофемашины.
 */
enum class Status {
    NEW, MAINTENANCE, REPAIR, COMMISSIONED, DECOMMISSIONED
}