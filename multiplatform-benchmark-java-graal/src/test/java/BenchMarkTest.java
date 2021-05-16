import org.junit.jupiter.api.Test;

public class BenchMarkTest {

    @Test
    void runMathBenchmark() {
        new BenchMark().runMathBenchmark();
    }

    @Test
    void runMemoryBenchmark() {
        new BenchMark().runMemoryBenchmark();
    }

    @Test
    void runStringBenchmark() {
        new BenchMark().runStringBenchmark();
    }
}
