package com.github.onotoliy.opposite.data.page

import kotlinx.serialization.Serializable

/**
 * Данные о старнице.
 *
 * @author Anatoliy Pokhresniy
 */
@Serializable
data class Meta(
    /**
     * Общее количество записей.
     */
    val total: Int = -1,

    /**
     * Мета данные страницы.
     */
    val paging: Paging = Paging()
)
