package com.hyeri.learningcoroutine.lec05

import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    // 부모 코루틴으로 예외를 전파하지 않음
    val job = async(SupervisorJob()) {
        throw IllegalArgumentException()
    }

    delay(1000)
    job.await() // 여기서 예외를 꺼내야 부모 코루틴이 기다림
}