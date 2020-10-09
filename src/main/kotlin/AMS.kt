import java.util.*
import kotlin.math.tan

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
    println(canAddFish(10.0, listOf(3, 3, 3))) // false
    println(canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false)) // true
    println(canAddFish(9.0, listOf(1, 1, 3), 3)) // false
    println(canAddFish(10.0, listOf(), 7, true)) // true
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun fishFood(day: String): String {

    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    return week[Random.nextInt(7)] // Random Kotlin way
    return week[Random().nextInt(7)] // Random Java Way
}

fun shouldChangeWater(day: String, temp: Int = 22, dirty: Int = 20): Boolean {
    return true
}

fun canAddFish(tanksize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tanksize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}