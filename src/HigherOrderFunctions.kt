

fun printUsername(name:String,printer:(String) -> String):String{
    val result = printer(name)
    println("My name is $result")
    return result
}

fun setManual(name:String):String{
    return name
}


fun convert(x:Double, converter: (Double) -> Double):Double{
    //invoke the lambda named converter
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun main(args: Array<String>) {
    var converter = {c:Double -> c * 1.8 + 32}
    var fahreheit = convert(20.0,converter)
    var jumoke = printUsername("Jumoke",{name:String -> name})
    var forShola = {name:String ->
        "My name is $name"
    }
    val result = forShola("Shola")
    var shola = setManual(result)
    println(shola)
}