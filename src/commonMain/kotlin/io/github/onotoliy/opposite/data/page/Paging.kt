package io.github.onotoliy.opposite.data.page

import kotlinx.serialization.Serializable

/**
 * Описание страницы.
 *
 * @author Anatoliy Pokhresniy
 */
@Serializable
data class Paging(
    /**
     * С какой записи выводить.
     */
    val start: Int = 0,

    /**
     * Размер странцы.
     */
    val size: Int = 10
)
