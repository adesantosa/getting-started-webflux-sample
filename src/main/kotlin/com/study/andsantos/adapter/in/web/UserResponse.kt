package com.study.andsantos.adapter.`in`.web

import com.study.andsantos.core.domain.User

data class UserResponse(
    val id: Long,
    val name: String,
    val userName: String,
    val email: String
)

fun User.toUserResponse() = UserResponse(
    id = id,
    name = name,
    userName = userName,
    email = email
)
