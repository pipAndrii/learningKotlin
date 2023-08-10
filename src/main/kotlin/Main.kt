fun main() {
    val operation = calculator('/')

    println("enter some nums-> a b ")
    var a = readln().toDouble()
    var b = readln().toDouble()
    println(operation(a,b))
}

fun calculator(key: Char): (Double, Double) -> Double {
    return when (key) {
        '+' -> {a, b -> a + b}
        '-' -> {a, b -> a - b}
        '*' -> {a, b -> a * b}
        '/' -> {a, b -> a / b}
        else -> {a, b -> 0.0}
    }
}
