fun main() {
    val operation = calculator('/')

    println("enter some nums-> a b ")
    var a = readln().toDouble()
    var b = readln().toDouble()
    println(operation(a,b))
}

fun calculator(key: Char): (Double, Double) -> Double {
    return when (key) {
        '+' -> fun (a: Double, b: Double) = a + b
        '-' -> fun (a: Double, b: Double) = a - b
        '*' -> fun (a: Double, b: Double) = a * b
        '/' -> fun (a: Double, b: Double) = a / b
        else -> fun(a: Double, b: Double) = 0.0
    }
}
