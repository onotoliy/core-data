package io.github.onotoliy.opposite.data.page

import kotlinx.serialization.Serializable

/**
 * Страница.
 *
 * @author Anatoliy Pokhresniy
 */
@Serializable
data class Page<T>(
    /**
     * Мета данные о списке.
     */
    val meta: Meta = Meta(),

    /**
     * Данные.
     */
    val context: List<T> = emptyList()
)
