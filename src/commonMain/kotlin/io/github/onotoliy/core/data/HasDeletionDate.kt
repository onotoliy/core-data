package io.github.onotoliy.core.data

import kotlinx.datetime.Instant

/**
 * Объект содержит дату удаления.
 *
 * @author Anatoliy Pokhresniy
 */
interface HasDeletionDate {

    /**
     * Дата удаления.
     */
    val deletionDate: Instant?
}
