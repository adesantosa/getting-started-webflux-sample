package com.study.andsantos.adapter.`in`.web

import com.study.andsantos.core.domain.Post

data class PostResponse(
    val id: Long,
    val userId: Long,
    val title: String,
    val body: String
)

fun Post.toPostResponse() = PostResponse(
    id = id,
    userId = userId,
    title = title,
    body = body
)
