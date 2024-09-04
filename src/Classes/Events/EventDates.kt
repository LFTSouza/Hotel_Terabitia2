package Classes.Events

import Objects.DateObj

class EventDates(
    private val eventDate: EventDate
){
    fun date() {
        println("Qual o dia do evento?");
        val dayEvent = readLine().toString().lowercase();
        DateObj.dayEvent = dayEvent;
        println("Qual a hora do evento?");
        val hourEvent = readLine()?.toIntOrNull() ?: 0;
        DateObj.hourEvent = hourEvent;
        eventDate.confirmDate();
    }
}