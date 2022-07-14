

fun convertFive(converter: (Int) -> Double):Double{
    val result = converter(5)
    println("5 is converted to $result")
    return result
}


fun convert(x:Double, converter: (Double) -> Double):Double{
    //invoke the lambda named converter and assign it's return value to result
    val result = converter(x)
    //print the result
    println("$x is converted to $result")
    return result
}

fun main(args: Array<String>) {
   convert(20.0) {it * 1.8 + 32}
    convertFive { it * 1.8 + 32 }

}
