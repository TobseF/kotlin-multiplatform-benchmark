class BenchmarkString {

    fun benchString(iterations: Int) {
        var c = 0L
        var string = ""
        for (i in 0..iterations) {
            c += (i / 3)
            c += 1
            val next = c % 10
            string += next
        }
    }


}