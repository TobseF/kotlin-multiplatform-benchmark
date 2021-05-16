class BenchmarkMemory {

    fun benchObjectList(iterations: Int): Int {
        val list = mutableListOf<PerpetuumMobile>()
        for (i in 0..iterations) {
            list.add(PerpetuumMobile("ABC-0$i", i, i / 3.0))
        }
        println("reached max")
        for (i in 0..iterations) {
            list.removeAt(list.size-1)
        }
        return list.size
    }

    class PerpetuumMobile(val name: String, val wheels: Int, val weight: Double)
}