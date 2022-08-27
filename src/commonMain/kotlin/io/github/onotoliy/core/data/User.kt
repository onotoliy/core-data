package io.github.onotoliy.core.data

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
