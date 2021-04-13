package com.study.andsantos.core.port.`in`

import com.study.andsantos.core.domain.Post
import com.study.andsantos.core.domain.User
import reactor.core.publisher.Flux

interface FindPostUseCase {

    fun find(userId: Long): Flux<Post>
}