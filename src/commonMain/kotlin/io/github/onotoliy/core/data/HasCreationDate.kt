package io.github.onotoliy.core.data

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
