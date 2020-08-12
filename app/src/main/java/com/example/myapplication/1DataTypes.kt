fun main() {
    val x = "10"
    val y = 23
    val z = 20

    val str: String       // if you write just val str, Kotlin will not understand what is it and results into error
    str = "hi fi"

    println("string $str"); //println("string"+str) is costly in Kotlin


    var name: String? // ? means it can have null value, but before any processing happens someone has to define value to this variable

    // name = null
    name = "abc"
    print("name ${name!!}") // !! if you have put this it means Dn't let it be Null


//facts:
    //what is variable declaration it is just assigning value to assigned memory location, as soon as fun main closes, it is removes , Garbagge collection of JAva

}