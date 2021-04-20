package com.study.andsantos.unit.adapter.`in`.web

import com.study.andsantos.adapter.`in`.web.PostResponse
import com.study.andsantos.adapter.`in`.web.toPostResponse
import com.study.andsantos.core.domain.Post
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostResponseTest {

    @Test
    fun `Should map to PostResponse with success`() {

        val post = Post(1L, 1L, "title1", "body1")

        val expected = PostResponse(1L, 1L, "title1", "body1")

        val actual = post.toPostResponse()

        assertThat(actual)
            .usingRecursiveComparison()
            .isEqualTo(expected)
    }
}
