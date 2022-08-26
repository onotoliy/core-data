package io.github.onotoliy.opposite.data.core

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

/**
 * Ошибка произощедшая на устройстве.
 *
 * @param uid Уникальный идентификатор.
 * @param device Устройство.
 * @param agent Агент.
 * @param message Сообщение.
 * @param localizedMessage Локализованнное соообщение.
 * @param stackTrace StackTrace.
 * @param creationDate Дата создания.
 * @author Anatoliy Pokhresniy
 */
@Serializable
data class DeviceException(
    override val uid: String = "",
    val device: String = "",
    val agent: String = "",
    val message: String = "",
    val localizedMessage: String = "",
    val stackTrace: String = "",
    override val creationDate: Instant = Clock.System.now()
): HasUID, HasCreationDate
