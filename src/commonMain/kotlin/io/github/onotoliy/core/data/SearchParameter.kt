package io.github.onotoliy.core.data

/**
 * Базовае поисковые параметры.
 *
 * @param numberOfRows Размер страницы.
 * @param offset Количество записей которое необходимо пропустить.
 * @author Anatoliy Pokhresnyi
 */
data class SearchParameter (
    val offset: Int = 0,
    val numberOfRows: Int = 10
)
