package com.study.andsantos.adapter.out.web

import com.fasterxml.jackson.annotation.JsonProperty
import com.study.andsantos.core.domain.User

data class UserJsonPlaceResponse(
    val id: Long,
    val name: String,
    @JsonProperty("username")
    val userName: String,
    val email: String
)

fun UserJsonPlaceResponse.toDomain() = User(
    id = id,
    name = name,
    userName = userName,
    email = email
)