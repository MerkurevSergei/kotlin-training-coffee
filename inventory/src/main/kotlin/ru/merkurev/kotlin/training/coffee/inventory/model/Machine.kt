package ru.merkurev.kotlin.training.coffee.inventory.model

import javax.persistence.Id

/**
 * Кофемашина.
 *
 * Основной агрегат, используется для хранения информации о местоположении и
 * статусе кофемашины.
 */
class Machine(id: Id, location: Location, status: Status)