fun main() {
    val operation = calculator('/')

    println("enter some nums-> a b ")
    var a = readln().toDouble()
    var b = readln().toDouble()
    println(operation(a,b))
}

fun calculator(key: Char): (Double, Double) -> Double {
    return when (key) {
        '+' -> ::sum
        '-' -> ::sub
        '*' -> ::mul
        '/' -> ::div
        else -> ::empty
    }
}

fun sum(a: Double, b: Double) = a + b
fun sub(a: Double, b: Double) = a - b
fun mul(a: Double, b: Double) = a * b
fun div(a: Double, b: Double) = a / b

fun empty(a: Double, b: Double) = 0.0
