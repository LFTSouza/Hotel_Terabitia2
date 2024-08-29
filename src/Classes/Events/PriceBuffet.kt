package Classes.Events

import Objects.BuffetObj
import Objects.PriceBuffetObj
import Objects.WaiterPayment

class PriceBuffet {
    fun price() {
        val calc = calculator();
        PriceBuffetObj.price = calc;
        println("Custo do buffet: R$$calc");
        println("Valor do evento: R$${calc + WaiterPayment.payment}");
    }

    private fun calculator(): Double {
        val coffePrice = BuffetObj.coffe * 0.8;
        val waterPrice = BuffetObj.water * 0.4;
        val savoryPrice = BuffetObj.savory * 34;
        val sum = coffePrice + waterPrice + savoryPrice;
        return sum
    }
}
/*
* cafe 0,80 cents
* water 0,40 cents
* savory 34
* */