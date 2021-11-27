import kotlinx.coroutines.*
import kotlin.concurrent.thread


fun main() = runBlocking {


    println("Main Thread Starts: ${Thread.currentThread().name}")

//    val job: Job = launch {     // Thread;main , it is following runBlocking coroutine ...
//        println("Fake worker thread: ${Thread.currentThread().name}")
////        Thread.sleep(1000)// instead of sleep use delay
//        delay(1000)     // coroutine is suspended but Thread:T1 is free
//        println("Fake work finished: ${Thread.currentThread().name}")    // Either Thread;T1 or some other thread.
//
//    }


    val jobDeferred: Deferred<Int> = async {     // Thread;main , it is following runBlocking coroutine ...
        println("Fake worker thread: ${Thread.currentThread().name}")
//        Thread.sleep(1000)// instead of sleep use delay
        delay(1000)     // coroutine is suspended but Thread:T1 is free
        println("Fake work finished: ${Thread.currentThread().name}")    // Either Thread;T1 or some other thread.

        21
    }



//    delay(2000)
// deferred is subclass of job interface..
    // job.cancel() to cancel a coroutine ...
   val num:Int =  jobDeferred.await()
//    jobDeferred.join()

myOwnSuspendingFunc( )

    println("Main Thread Ends: ${Thread.currentThread().name}")  // Main thread

}

/***** runBlocking is used to write test cases   *****/

suspend fun myOwnSuspendingFunc( ){
    delay(2000)
}