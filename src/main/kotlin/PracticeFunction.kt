import java.util.*

fun main(){
    when(dayOfWeek()){
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Day Not Found")
    }
}

//fun dayOfWeek() = println("What day is today?")

//fun  dayOfWeek() : Int{
//   return Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
//}
fun dayOfWeek(): Int = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)