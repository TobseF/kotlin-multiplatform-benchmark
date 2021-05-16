import kotlin.system.getTimeMillis
import kotlin.test.Test

class NativeBenchTest {

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

