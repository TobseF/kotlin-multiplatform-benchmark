public class BenchmarkString {
    void benchString(int iterations) {
        var c = 0;
        var string = "";
        for (int i = 0; i < iterations; i++) {
            c += (i / 3);
            c += 1;
            var next = c % 10;
            string += next;
        }
    }
}
