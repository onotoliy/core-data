package com.github.onotoliy.opposite.data.core

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
