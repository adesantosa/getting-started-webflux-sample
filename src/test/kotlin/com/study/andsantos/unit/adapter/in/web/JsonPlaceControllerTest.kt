package com.study.andsantos.unit.adapter.`in`.web

import com.study.andsantos.adapter.`in`.web.JsonPlaceController
import com.study.andsantos.adapter.`in`.web.PostResponse
import com.study.andsantos.adapter.`in`.web.UserResponse
import com.study.andsantos.core.domain.Post
import com.study.andsantos.core.domain.User
import com.study.andsantos.core.port.`in`.FindPostUseCase
import com.study.andsantos.core.port.`in`.FindUserUseCase
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test
import reactor.core.publisher.Flux
import reactor.test.StepVerifier

internal class JsonPlaceControllerTest {

    private val userUseCase = mockk<FindUserUseCase>()

    private val postUseCase = mockk<FindPostUseCase>()

    private val jsonPlaceController = JsonPlaceController(userUseCase, postUseCase)

    @Test
    fun `Should find users with empty return success`() {

        every { userUseCase.find() } returns Flux.empty()

        val actual = jsonPlaceController.findUsers()

        StepVerifier
            .create(actual)
            .expectComplete()
            .log()
            .verify()
    }

    @Test
    fun `Should find users return success`() {

        val mock = Flux.just(
            User(1L, "name1", "userName1", "email1@email.com"),
            User(2L, "name2", "userName2", "email2@email.com"),
            User(3L, "name3", "userName3", "email3@email.com")
        )

        every { userUseCase.find() } returns mock

        val expected = mock.map {
            UserResponse(it.id, it.name, it.userName, it.email)
        }.toIterable()

        val actual = jsonPlaceController.findUsers()

        StepVerifier
            .create(actual)
            .expectNextSequence(expected)
            .expectComplete()
            .log()
            .verify()
    }

    @Test
    fun `Should find posts with empty return success`() {

        every { postUseCase.find(any()) } returns Flux.empty()

        val actual = jsonPlaceController.findPosts(1L)

        StepVerifier
            .create(actual)
            .expectComplete()
            .log()
            .verify()
    }

    @Test
    fun `Should find posts return success`() {

        val userId = 1L

        val mock = Flux.just(
            Post(1L, userId, "title1", "body1"),
            Post(2L, userId, "title2", "body2"),
            Post(3L, userId, "title3", "body3"),
        )

        every { postUseCase.find(any()) } returns mock

        val expected = mock.map {
            PostResponse(it.id, it.userId, it.title, it.body)
        }.toIterable()

        val actual = jsonPlaceController.findPosts(userId)

        StepVerifier
            .create(actual)
            .expectNextSequence(expected)
            .expectComplete()
            .log()
            .verify()
    }
}
