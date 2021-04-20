package com.study.andsantos.core.domain

data class Post(
    val id: Long,
    val userId: Long,
    val title: String,
    val body: String
)
