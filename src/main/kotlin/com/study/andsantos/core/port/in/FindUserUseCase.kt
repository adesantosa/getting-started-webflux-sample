package com.study.andsantos.core.port.`in`

import com.study.andsantos.core.domain.User
import reactor.core.publisher.Flux

interface FindUserUseCase {

    fun find(): Flux<User>
}