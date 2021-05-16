# ⏱ Kotlin Multiplatform Benchmark

Several small benchmarks to compare:
* Kotlin JVM
* Kotlin JS
* Kotlin Native
* Java JVM
* Kotlin GraalVM
* Java GraalVM

It contains three benchmarks:

### Math
> Simple computations
```kotlin
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
```

### String
> String concatenation
```kotlin
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
```
### Memory
> Class instantiation
```kotlin
fun benchObjectList(iterations: Int): Int {
    val list = mutableListOf<Machine>()
    for (i in 0..iterations) {
        list.add(Machine("ABC-0$i", i, i / 3.0))
    }
    return list.size
}

class Machine(val name: String, val wheels: Int, val weight: Double)
```