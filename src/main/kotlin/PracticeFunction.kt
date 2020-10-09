import java.util.*

//import kotlin.random.Random


fun main() {
    when (dayOfWeek()) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Day Not Found")
    }

//    var fortune: String
//    for (i in 1..10) {
//        var birthday = getBirthday();
//        fortune = when (birthday) {
//            28, 31 -> "28, 31 People Na wah ooo"
//            in 1..7 -> "First week people una to early ooo"
//            else -> getFortuneCookie(birthday)
//        }
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break
//    }

    //println("Your fortune is: ${getFortuneCookie()}")

    println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday("sad"))
    print("How do you feel?")
    println(whatShouldIDoToday(readLine()!!))
}

fun getFortuneCookie(birthday: Int): String {
    val cookies = listOf("You will have a great day.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Take it easy and enjoy life",
        "Life na jeje no rush am ",
        "Use your head wella and everything go work out",
        "Today is a good day for exercising restraint.")
    val position: Int =
        birthday % cookies.size //Divide the birthday by the number of fortunes, and use the remainder as the index for the fortune to return.
    return cookies[position] // Return the fortune
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()!!.toIntOrNull() ?: 1

    // Same as above
    // return readLine()?.toIntOrNull() ?: 1 // Receive value, check if it is null and set default to 1
}

//fun dayOfWeek() = println("What day is today?")

//fun  dayOfWeek() : Int{
//   return Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
//}
fun dayOfWeek(): Int = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isVeryHot(temperature) -> "go swimming"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isHappySunny(mood, weather) -> "go for a walk"
        else -> "Stay home and read."
    }
}


fun isVeryHot(temperature: Int) = temperature > 35
fun isSadRainyCold(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun isHappySunny(mood: String, weather: String) = mood == "happy" && weather == "sunny"

