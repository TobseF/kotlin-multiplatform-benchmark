import kotlin.system.getTimeMillis

actual fun getCurrentTimeInMillis(): Long = getTimeMillis()

fun main() {
    //BenchMark().runMathBenchmark()
   // BenchMark().runStringBenchmark()
    BenchMark().runMemoryBenchmark()
}
