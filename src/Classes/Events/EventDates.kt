package Classes.Events

import Objects.DateObj

class EventDates(
    private val waiter: Waiter
){
    fun date() {
        println("Qual o dia do evento?");
        val dayEvent = readLine().toString();
        DateObj.dayEvent = dayEvent;
        println("Qual a hora do evento?");
        val hourEvent = readLine()?.toIntOrNull() ?: 0;
        DateObj.hourEvent = hourEvent;
        waiter.waiterHour();
    }
}