package com.study.andsantos.adapter.out.web

import com.study.andsantos.core.domain.Post
import com.study.andsantos.core.domain.User
import com.study.andsantos.core.port.out.FindPostPort
import com.study.andsantos.core.port.out.FindUserPort
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Flux

@Component
class JsonPlaceClientAdapter(
    private val webClientBuilder: WebClient.Builder
) : FindUserPort, FindPostPort {

  private val webClient = webClientBuilder.baseUrl("https://jsonplaceholder.typicode.com/").build()

  override fun findUser(): Flux<User> =
    webClient.get()
        .uri("/users")
        .retrieve()
        .bodyToFlux(UserJsonPlaceResponse::class.java)
        .map{ it.toDomain() }


  override fun findPost(user: User): Flux<Post> {
    TODO("Not yet implemented")
  }

}