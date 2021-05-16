public class BenchmarkMath {

    void benchMath(int iterations) {
        var c = 0.0;
        for (int i =0; i < iterations; i++) {
            c += (i / 2.0);
            c += (i % 3.0);
            c += Math.sqrt(i * 3.0);
            c += 1;
        }
    }
}
