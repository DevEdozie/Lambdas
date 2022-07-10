fun main(args: Array<String>) {
    val x = 20
    val y = 2.3

    val lam1 = { x: Int -> x }
    println(lam1(x + 6)) // 26

    val lam2: (Double) -> Double
    lam2 = { (it * 2) + 5 }
    println(lam2(y)) //9.6

    val lam3:(Double,Double) -> Unit
    lam3 = {x,y -> println(x + y)}
    lam3.invoke(y,y) //4.6

    var lam4 = {y:Int -> (y/2).toDouble()}
    println(lam4(x)) //10.013
    lam4 = {it + 6.3}
    println(lam4(7)) //13.3
    //assignment

    var lambda1: (Double) -> Int
    var lambba2:(Int) -> Double
    var lambda3:(Int) -> Int
    var lambda4:(Double) -> Unit
    //var lambda5
    lambba2 = {it + 7.1}
    lambda3 = {(it * 3) - 4}
    var lambda5 = {x:Int -> x + 56}
    lambda4 = {println("Hello!")}





}