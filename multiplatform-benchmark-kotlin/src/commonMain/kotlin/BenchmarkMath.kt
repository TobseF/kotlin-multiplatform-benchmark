import kotlin.math.acos
import kotlin.math.sqrt

class BenchmarkMath {

    fun benchMath(iterations: Int): Double {
        var c = 0.0
        for (i in 0..iterations) {
            c += (i / 2.0)
            c += (i % 3.0)
            c += sqrt(i * 3.0)
            c += 1
        }
        return c
    }

}