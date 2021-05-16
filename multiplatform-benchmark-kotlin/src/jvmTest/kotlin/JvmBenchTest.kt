import kotlin.test.Test

class JvmBenchTest {

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

