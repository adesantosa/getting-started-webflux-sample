package com.study.andsantos.adapter.`in`.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class JsonPlaceController(
//    private val userUseCase: FindUserUseCase,
//    private val postUseCase: FindPostUseCase
) {

    @GetMapping("/users")
    fun findUsers(): Flux<UserResponse> {
        //TODO

        return Flux.empty()
    }

    @GetMapping("/users/{id}/posts")
    fun findPosts(@PathVariable id: Long): Flux<PostResponse> {
        //TODO

        return Flux.empty()
    }

}