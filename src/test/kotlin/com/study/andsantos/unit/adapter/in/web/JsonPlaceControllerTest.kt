package com.study.andsantos.unit.adapter.`in`.web

import com.study.andsantos.adapter.`in`.web.JsonPlaceController
import com.study.andsantos.core.port.`in`.FindPostUseCase
import com.study.andsantos.core.port.`in`.FindUserUseCase
import io.mockk.every
import io.mockk.junit5.MockKExtension
import io.mockk.mockk
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import reactor.core.publisher.Flux
import reactor.test.StepVerifier

@ExtendWith(MockKExtension::class)
internal class JsonPlaceControllerTest {

    private val userUseCase = mockk<FindUserUseCase>()

    private val postUseCase = mockk<FindPostUseCase>()

    private val jsonPlaceController = JsonPlaceController(userUseCase, postUseCase)

    @Test
    fun `Should find users with success`() {

        every { userUseCase.find() } returns Flux.empty()

        val actual = jsonPlaceController.findUsers()

        StepVerifier
            .create(actual)
            .expectComplete()
            .log()
            .verify()
    }

    @Test
    fun findPosts() {
    }
}
