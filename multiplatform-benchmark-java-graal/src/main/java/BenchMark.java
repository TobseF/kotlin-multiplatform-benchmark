public class BenchMark {

    public static void main(String[] args) {
        new BenchMark().runMathBenchmark();
        //new BenchMark().runStringBenchmark();
        //new BenchMark().runMemoryBenchmark();
    }

    void runMemoryBenchmark() {
        println("Memory Benchmark");
        measureTime(() -> new BenchmarkMemory().benchObjectList(10_000_000));
    }

    void runMathBenchmark() {
        println("Math Benchmark");
        measureTime(() -> new BenchmarkMath().benchMath(100_000_000));
    }

    void runStringBenchmark() {
        println("String Benchmark");
        measureTime(() -> new BenchmarkString().benchString(100_000));
    }


    private void measureTime(Runnable runnable) {
        var start = getCurrentTimeInMillis();
        runnable.run();
        var end = getCurrentTimeInMillis();
        var duration = end - start;
        println(duration);
    }

    private long getCurrentTimeInMillis() {
        return System.currentTimeMillis();
    }

    static void println(long string) {
        println(String.valueOf(string));
    }

    static void println(String string) {
        System.out.println(string);
    }

}
