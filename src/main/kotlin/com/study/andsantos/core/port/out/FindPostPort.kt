package com.study.andsantos.core.port.out

import com.study.andsantos.core.domain.Post
import reactor.core.publisher.Flux

interface FindPostPort {

    fun findPost(userId: Long): Flux<Post>
}