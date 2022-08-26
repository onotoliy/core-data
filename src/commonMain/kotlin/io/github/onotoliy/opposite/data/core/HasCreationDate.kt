package io.github.onotoliy.opposite.data.core

import kotlinx.datetime.Instant

/**
 * Объект содержит дату создания.
 *
 * @author Anatoliy Pokhresniy
 */
interface HasCreationDate {

    /**
     * Дата создания.
     */
    val creationDate: Instant

}
