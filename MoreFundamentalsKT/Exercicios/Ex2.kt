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

fun main() {
    val evento = Event(title="Study Kotlin", description="Commit to studying Kotlin at least 15 minutes per day.",
    daypart=Daypart.Morning, duration=15)
    
    println("Title: "+evento.title)
	println("Description: "+evento.description)
    println("Daypart: "+evento.daypart)
    println("Duration: "+evento.duration)
}