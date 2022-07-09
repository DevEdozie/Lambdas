fun main(args: Array<String>) {
    var addFive = {x:Int -> x + 5}
    println("Pass 6 to addFive: ${addFive(6)}")
    println("Pass 7 to addFive: ${addFive.invoke(7)}")

    val addInts = {x:Int,y:Int -> x + y}
    val result = addInts.invoke(6,7)

    val intLambda:(Int,Int) -> Int = {x,y -> x * y}
    println("Pass 10,11 ti intLambda: ${intLambda(10,11)}")

    val addSeven: (Int) -> Int = {it + 7}
    println("Pass 12 to addSeven: ${addSeven(12)}")

    val myLambda: () -> Unit = {println("Hi!")}
    myLambda()

}
