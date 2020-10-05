import java.util.*
//import kotlin.random.Random

//fun main(args: Array<String>){
//    println("Hello ${args[0]}")
// if (args[0].toInt() < 12) println("Good morning, Kotlin")
// else println("Good night, Kotlin" )
//}

//fun main(){
//    println("Hello Kotlin")
//}

//fun main() = println("Hello Kotlin")

fun main() {
//    var time = 23
//    println("Good ${if (time < 12) "Morning" else "Evening"} Kotlin")
    feedTheFish()
}

fun feedTheFish(){
    val day = "Tuesday"
    val food = "pellets"
    println("Today is ${randomDay()} and the fish eat $food")
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    return week[Random.nextInt(7)] // Random Kotlin way
    return week[Random().nextInt(7)] // Random Java Way
}