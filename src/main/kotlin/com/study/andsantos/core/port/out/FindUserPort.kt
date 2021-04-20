package com.study.andsantos.core.port.out

import com.study.andsantos.core.domain.User
import reactor.core.publisher.Flux

interface FindUserPort {

    fun findUser(): Flux<User>
}
