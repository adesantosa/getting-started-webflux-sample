package com.study.andsantos.core.service

import com.study.andsantos.core.port.`in`.FindUserUseCase
import com.study.andsantos.core.port.out.FindUserPort
import org.springframework.stereotype.Service

@Service
class FindUserService(
    private val findUserPort: FindUserPort
) : FindUserUseCase {

    override fun find() = findUserPort.findUser()
}
