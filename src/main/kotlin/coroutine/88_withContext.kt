package coroutine

import kotlinx.coroutines.*
import java.lang.Exception
import kotlin.system.measureTimeMillis

fun main() = runBlocking<Unit> {
  newSingleThreadContext("Ctx1").use { ctx1 ->
    newSingleThreadContext("Ctx2").use { ctx2 ->
        runBlocking(ctx1) {
            log("Started in ctx1")
            withContext(ctx2) {
                log("Working in ctx2")
            }

            log("Back to ctx1")
        }
    }
  }
}
