import kotlin.test.assertEquals
import org.junit.Test

class helloWorldTest {
    @Test fun testAssert() {
        assertEquals("Hello, world!", getHelloString())
    }
}