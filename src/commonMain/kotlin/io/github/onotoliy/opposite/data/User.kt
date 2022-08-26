package io.github.onotoliy.opposite.data

import io.github.onotoliy.opposite.data.core.HasName
import io.github.onotoliy.opposite.data.core.HasUID
import kotlinx.serialization.Serializable

/**
 * Пользователь.
 *
 * @param uid Уникальный идентификатор.
 * @param name Название.
 * @param username Логин.
 * @param email Электронная почта
 * @param roles Роли
 * @author Anatoliy Pokhresniy
 */
@Serializable
data class User(
    override val uid: String = "",
    override val name: String = "",
    val username: String = "",
    val email: String = "",
    val roles: Set<String> = setOf()
) : HasUID, HasName
