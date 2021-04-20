package com.study.andsantos.core.service

import com.study.andsantos.core.port.`in`.FindPostUseCase
import com.study.andsantos.core.port.out.FindPostPort
import org.springframework.stereotype.Service

@Service
class FindPostService(
    private val findPostPort: FindPostPort
) : FindPostUseCase {

    override fun find(userId: Long) =
        findPostPort.findPost(userId)
}
