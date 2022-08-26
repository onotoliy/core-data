package io.github.onotoliy.opposite.data

import io.github.onotoliy.opposite.data.core.HasUID
import io.github.onotoliy.opposite.data.core.HasName
import kotlinx.serialization.Serializable

/**
 * Короткая информация об объекте.
 *
 * @param uid Уникальный идентификатор.
 * @param name Название.
 * @author Anatoliy Pokhresniy
 */
@Serializable
data class Option(
    override val uid: String = "",
    override val name: String = ""
) : HasUID, HasName {
    override fun toString(): String = "{\"uuid\": \"$uid\", \"name\": \"$name\"}"
}
