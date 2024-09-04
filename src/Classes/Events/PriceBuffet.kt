package Classes.Events

import Objects.BuffetObj
import Objects.PriceBuffetObj
import Objects.WaiterPayment

class PriceBuffet(
    private val reportEvent: ReportEvent
){
    fun price() {
        val sum: Double;
        val calc = calculator();
        PriceBuffetObj.price = calc;
        sum = calc + WaiterPayment.payment;
        println("Custo do buffet: R$$calc");
        println("Valor do evento: R$$sum");
        reportEvent.report();
    }

    private fun calculator(): Double {
        val coffePrice = BuffetObj.coffe;
        val waterPrice = BuffetObj.water;
        val savoryPrice = BuffetObj.savory;
        val sum = coffePrice + waterPrice + savoryPrice;
        return sum
    }
}