package ru.merkurev.kotlin.training.coffee.inventory.model

/**
 * Состояние кофемашины.
 * DEPLOYMENT - подготовка к эскплуатации
 * DISPOSED - выбыло из эксплуатации
 * MAINTENANCE - обслуживание / ремонт
 * UTILIZATION - в эксплуатации
 */
enum class Status {
    DEPLOYMENT, DISPOSED, MAINTENANCE, UTILIZATION
}