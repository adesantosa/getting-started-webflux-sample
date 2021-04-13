package com.study.andsantos.core.domain

import com.study.andsantos.adapter.`in`.web.UserResponse

data class User(
    val id: Long,
    val name: String,
    val userName: String,
    val email: String
)