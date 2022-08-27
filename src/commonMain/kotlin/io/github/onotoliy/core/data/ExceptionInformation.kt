package io.github.onotoliy.core.data

import kotlinx.serialization.Serializable

/**
 * Информация об ошибке.
 *
 * @param status Статус.
 * @param message Сообщение.
 * @author Anatoliy Pokhresniy
 */
@Serializable
data class ExceptionInformation(
    val status: HTTPStatus = HTTPStatus.INTERNAL_SERVER_ERROR,
    val message: String = ""
)
