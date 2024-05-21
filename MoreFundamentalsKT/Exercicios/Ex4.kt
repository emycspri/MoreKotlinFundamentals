enum class Daypart {
    Morning,
    Afternoon,
    Evening,
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val duration: Int,
)

val event1 = Event(title = "Wake up", description = "Time to get up",daypart = Daypart.Morning,
      duration = 0)

val event2 = Event(title = "Eat breakfast", daypart = Daypart.Morning,
      duration = 15)

val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.Afternoon,
      duration = 30)

val event4 = Event(title = "Practice Compose", daypart = Daypart.Afternoon,
      duration = 60)

val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.Afternoon,
      duration = 10)

val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.Evening,
      duration = 45)

fun main() {
    
    val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)
    
    val eventos_curtos = events.filter { it.duration < 60 }

    println("You have ${eventos_curtos.size} short events.")

}
