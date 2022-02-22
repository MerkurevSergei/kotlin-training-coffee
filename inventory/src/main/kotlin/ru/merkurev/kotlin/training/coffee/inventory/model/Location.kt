package ru.merkurev.kotlin.training.coffee.inventory.model

/**
 * Местоположение.
 *
 * Определяет положение объекта в прямоугольной системе координат.
 * Предполагается, что внешняя система сама реализует логику позиционирования,
 * обработку ошибок и прочие преобразования связанные с местоположением.
 */
data class Location(val x: Int, val y: Int)