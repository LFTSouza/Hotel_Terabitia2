package Classes.Events

import Objects.DateObj
import Objects.PeopleEnvitedObj
import Objects.WaiterPayment
import Objects.WaitersObj
import java.math.RoundingMode

class Waiter(
    private val buffet: Buffet
) {
    fun waiterHour() {
        println("Qual a duração do evento em horas?");
        val chooseAnswer = readLine()?.toIntOrNull() ?: 0;
        DateObj.hourEventFinal = chooseAnswer;
        when {
            chooseAnswer <= 0 -> {
                println("Por favor, digite um número positivo");
                waiterHour();
            }

            else -> {
                val waitersNeed = calculateWaiters(chooseAnswer, PeopleEnvitedObj.peopleEnvited);
                WaitersObj.Waiter = waitersNeed;
                println("São necessários $waitersNeed garçons");
                println("Custo: R$ ${waitersNeed * 10.5}");
                WaiterPayment.payment = waitersNeed * 10.5;
            }
        }
        buffet.buffet();
    }

    private fun calculateWaiters(durationHours: Int, numberOfGuests: Int): Double {
        val numGuests = numberOfGuests / 12;
        val numDuration = durationHours / 2;
        val waiterPorHour = numDuration * 2;
        val totalWaiter = numGuests + waiterPorHour;
       return totalWaiter.toDouble();
    }
}