package coroutine

import kotlinx.coroutines.*
import java.lang.Exception
import kotlin.system.measureTimeMillis

fun main() = runBlocking<Unit> {
 println("My Job is ${coroutineContext[Job]}")
}
