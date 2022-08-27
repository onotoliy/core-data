package io.github.onotoliy.core.data

/**
 * Статус ответа.
 *
 * @author Anatoliy Pokhresniy
 */
enum class HTTPStatus {

    /**
     * Ошибка сервера.
     */
    INTERNAL_SERVER_ERROR,

    /**
     * Некорректные данные.
     */
    BAD_REQUEST,

    /**
     * Объект не найден.
     */
    NOT_FOUND,

    /**
     * Дубликат.
     */
    CONFLICT
}
