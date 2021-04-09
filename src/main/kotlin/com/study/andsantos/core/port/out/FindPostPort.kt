package com.study.andsantos.core.port.out

import com.study.andsantos.core.domain.Post
import com.study.andsantos.core.domain.User
import reactor.core.publisher.Flux

interface FindPostPort {

    fun findPost(user: User): Flux<Post>
}