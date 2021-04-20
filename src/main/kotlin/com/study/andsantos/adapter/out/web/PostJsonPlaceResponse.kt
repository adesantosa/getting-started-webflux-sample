package com.study.andsantos.adapter.out.web

import com.study.andsantos.core.domain.Post

data class PostJsonPlaceResponse(
    val id: Long,
    val userId: Long,
    val title: String,
    val body: String
)

fun PostJsonPlaceResponse.toDomain() = Post(
    id = id,
    userId = userId,
    title = title,
    body = body
)
