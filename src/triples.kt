fun main() {
    val abc: Triple<Int, Int, Int> = Triple(5,5,15)
    println(abc.first)
    println(abc.second)
    println(abc.third)
    println()

    val efg: Triple<Int, Int, Double> = Triple(18,7,2.0)
    val (e,f,g) = efg
    println(e)
    println(f)
    println(g)
    println()

    val hij: Triple<Int, Int, Float> = Triple(3,5,0.3F)
    println(hij.first)
    println(hij.second)
    println(hij.third)
    println()

    val klm: Triple<Int, Double, Float> = Triple(5,18.0,5.7F)
    val (k,l,m) = klm
    println(k)
    println(l)
    println(m)
    println()

    val nop: Triple<Int, Float, Double> = Triple(18,5.0F,18.0)
    val (n,o,_) = nop
    println(n)
    println(o)
    println()
}