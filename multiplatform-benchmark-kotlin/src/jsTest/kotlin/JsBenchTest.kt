import kotlin.js.Date
import kotlin.test.Test

class JsBenchTest {

    @Test
    fun runMathBenchmark() {
        BenchMark().runMathBenchmark()
    }

    @Test
    fun runStringBenchmark() {
        BenchMark().runStringBenchmark()
    }

    @Test
    fun runMemoryBenchmark() {
        BenchMark().runMemoryBenchmark()
    }
}

