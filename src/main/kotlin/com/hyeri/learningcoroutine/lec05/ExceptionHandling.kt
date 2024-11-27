package com.hyeri.learningcoroutine.lec05

import kotlinx.coroutines.*

fun main(): Unit = runBlocking {
    // 예외를 발생시키면서 종료
    val job1 = CoroutineScope(Dispatchers.Default).launch {
        throw IllegalArgumentException()
    }

    // 예외가 발생하지 않음 (await 추가 시 예외 발생)
    val job2 = CoroutineScope(Dispatchers.Default).async {
        throw IllegalArgumentException()
    }

    val job3 = async {
        throw IllegalArgumentException()
    }

    delay(1000)
    job2.await()
}