package coroutine

import kotlinx.coroutines.*
import java.lang.Exception
import kotlin.system.measureTimeMillis

fun main() = runBlocking<Unit> {
   launch {
       println("main runBlocking : I'm working in thread ${Thread.currentThread().name}") // main
   }

    launch(Dispatchers.Unconfined) {
        println("Unconfined runBlocking : I'm working in thread ${Thread.currentThread().name}")
    }

    launch(Dispatchers.IO) {
        println("IO runBlocking : I'm working in thread ${Thread.currentThread().name}")
    }

    launch(Dispatchers.Default) {
        println("Default runBlocking : I'm working in thread ${Thread.currentThread().name}")
    }

    launch(newSingleThreadContext("MyOwnThread")) {
        println("MyOwnThread runBlocking : I'm working in thread ${Thread.currentThread().name}")
    }

    newSingleThreadContext("MyOwnThread2").use {
        launch(it){
            println("MyOwnThread2 runBlocking : I'm working in thread ${Thread.currentThread().name}")
        }
    }

}
