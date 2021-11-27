import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class SimpleTest {

    @Test
    fun myFirstTest() =  runBlocking  {

        myOwnSuspendingFunc()
        Assert.assertEquals(10,5+5)
    }
}

/******* runBlocking blocks the thread in which it operates... ******/