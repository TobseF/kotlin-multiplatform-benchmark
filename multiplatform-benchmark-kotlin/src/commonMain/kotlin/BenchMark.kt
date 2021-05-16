class BenchMark {

    fun runMathBenchmark() {
        println("Math Benchmark")
        measureTime {
            // Printing the results prevents GraalVM of skipping the computation
            println("result: " + BenchmarkMath().benchMath(100_000_000))
        }
    }

    fun runStringBenchmark() {
        println("String Benchmark")
        measureTime {
            BenchmarkString().benchString(100_000)
        }
    }

    fun runMemoryBenchmark() {
        println("Memory Benchmark")
        measureTime {
            BenchmarkMemory().benchObjectList(10_000_000)
        }
    }

}

private fun measureTime(benchmark: () -> Any) {
    val start = getCurrentTimeInMillis()
    benchmark.invoke()
    val end = getCurrentTimeInMillis()
    val duration = end - start
    println(duration)
}

expect fun getCurrentTimeInMillis(): Long
