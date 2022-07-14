

fun printUsername(name:String,printer:(String) -> String):String{
    val result = printer(name)
    println("My name is $result")
    return result
}

fun setManual(name:String):String{
    return name
}


fun main(args: Array<String>) {
    var fahreheit = convert(20.0) {c:Double -> c * 1.8 + 32}
    var jumoke = printUsername("Jumoke",{name:String -> name})
    var forShola = {name:String ->
        "My name is $name"
    }
    val result = forShola("Shola")
    var shola = setManual(result)
    println(shola)
    var five = convertFive { it * 1.8 + 32 }
}