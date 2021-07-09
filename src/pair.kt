fun main() {
    val eAndZ: Pair<Double, Double> = Pair (5.5, 18.7)
    println(eAndZ.first)
    println(eAndZ.second)
    println()

    val xAndYWithto = 5 to 1.8
    println(xAndYWithto.first)
    println(xAndYWithto.second)
    println()

    val bAndC = 0.5 to 18
    val (b,c) = bAndC
    println(b)
    println(c)
    println()

    val dAndE = 15 to 30
    val (d,e) = dAndE
    println(d)
    println(e)
    println()

    val fAndG = 18 to 7
    val (f,g) = fAndG
    println(f)
    println(g)
}