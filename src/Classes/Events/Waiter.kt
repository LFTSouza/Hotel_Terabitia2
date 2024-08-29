package Classes.Events

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
        val waitersPerHour = durationHours * 0.5;
        val waitersPerGuest = numberOfGuests * 0.05;

        val waitersNeed = (durationHours * waitersPerHour + numberOfGuests * waitersPerGuest);
        val rounded = waitersNeed.toBigDecimal().setScale(1, RoundingMode.UP).toDouble();
        return rounded;
    }
}
/*
* garçom = RS 10.50/hora
* receba um numero de garçons
* receba o numero de hrs do evento
* para cada 12 convidados é necessário 1 garçom
* para cada 2h de evento +1 garçom
* */