import kotlin.test.Test
import kotlin.test.assertEquals

class TestLibrary {
    @Test
    fun test(){
        assertEquals("S1", Library.addString("S", "1"))
    }
}