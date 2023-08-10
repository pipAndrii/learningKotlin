fun main()
{
    val sum :(Int,Int) ->Int  = {x, y -> x+y }

    val a = sum(2, 3)   // 5
    val b = sum(4, 5)   // 9
    println("a=$a  b=$b" )
}