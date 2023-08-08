import kotlin.math.abs
import kotlin.math.pow

fun main() {
    guessMyNum()
}
fun guessMyNum()
{
    var pcNum = 50
    println("Hello guess some num from 0 to 100 and I will do magic")
    var input:String = ""
    while (input != "S") {
        pcNum = guess(pcNum,input)
        println("your num is bigger than $pcNum")
        println("Enter command\nY - yes\nN - no\nS - stop")
        input = readln()
    }
    println("Thanks for your time")
}
fun guess(temp:Int, input:String):Int
{
    var pcNum = temp

    if(input == "Y") {
        pcNum +=pcNum/2
    }
    if(input == "N") {
        pcNum -= pcNum / 2
    }

    return pcNum
}

