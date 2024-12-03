package com.hyeri.learningcoroutine.lec05

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    launch {
        try {
            throw RuntimeException("launch 오류 발생")
        } catch (e: Exception) {
            println("launch 정상 종료")
        }
    }
}