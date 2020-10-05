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

    var fortune: String
    for (i in 1..10) {
        fortune = getFortuneCookie()
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }

    //println("Your fortune is: ${getFortuneCookie()}")
}

fun getFortuneCookie(): String {
    val cookies = listOf("You will have a great day.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Take it easy and enjoy life",
        "Life na jeje no rush am ",
        "Use your head wella and everything go work out",
        "Today is a good day for exercising restraint.")
    print("Enter your birthday: ")

    val birthday = readLine()!!.toIntOrNull() ?: 1 // Receives value from console Check if birthday input is not Integer then assign 1 to birthday
    // Same as above
    //val birthday = readLine()?.toIntOrNull() ?: 1 // Receive value, check if it is null and set default to 1
    val urCookiePos: Int = birthday % cookies.size //Divide the birthday by the number of fortunes, and use the remainder as the index for the fortune to return.
    return cookies[urCookiePos] // Return the fortune
//    or  return cookies[birthday.rem(cookies.size)]
//    return cookies[Random().nextInt(6)]

}


//fun dayOfWeek() = println("What day is today?")

//fun  dayOfWeek() : Int{
//   return Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
//}
fun dayOfWeek(): Int = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
