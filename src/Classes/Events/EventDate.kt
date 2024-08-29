package Classes.Events

import Objects.DateObj.dayEvent
import Objects.DateObj.hourEvent

class EventDate(
    private val eventDates: EventDates
) {
    private var companyName = "";
    fun ConfirmDate() {
        eventDates.date();
        when {
            (dayEvent.equals("sabado") || dayEvent.equals("domingo")) -> {
                if (hourEvent > 15 || hourEvent < 7) println("Auditório indisponivel") else {
                    available();
                }
            }

            else -> {
                if (hourEvent > 23 || hourEvent < 7) println("Auditório indisponivel") else {
                    available();
                }
            }
        }
    }

    private fun available() {
        println("Auditório disponivel");
        println("Qual o nome da empresa");
        companyName = readLine() ?: "";
        println("Auditório reservado para $companyName $dayEvent às $hourEvent");
    }
}
