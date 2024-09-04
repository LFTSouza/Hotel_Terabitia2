package Classes.Events

import Objects.PeopleEnvitedObj
import Objects.BuffetObj

class Buffet (
    private val priceBuffet: PriceBuffet
) {
    fun buffet() {
        val coffe = qntcoffe(PeopleEnvitedObj.peopleEnvited);
        val priceCoffe = priceCoffe(coffe);
        BuffetObj.coffe = priceCoffe;
        val water = qntWater(PeopleEnvitedObj.peopleEnvited);
        val priceWater = priceWater(water);
        BuffetObj.water = priceWater;
        val savory = qntSavory(PeopleEnvitedObj.peopleEnvited);
        val priceSavory = priceSavory(savory);
        BuffetObj.savory = priceSavory.toDouble();
        println("O evento precisará de $coffe litros de café, $water litros de água, $savory salgados");
        priceBuffet.price();
    };

    private fun qntcoffe(qntdEnvited: Int):Double {
        val qntdCafe = qntdEnvited * 0.2;
        return qntdCafe
    };

    private fun priceCoffe(qntdLitros: Double): Double{
        val resut = qntdLitros * 0.8;
        return resut;
    };

    private fun qntWater(qntdEnvited: Int): Double {
        val qntdWater = qntdEnvited * 0.5;
        return qntdWater
    };

    private fun priceWater(qntdLitros: Double): Double{
        val result = qntdLitros * 0.4;
        return result;
    };

    private fun qntSavory(qntdEnvited: Int): Int {
        val qntdSavory = qntdEnvited * 7
        return qntdSavory
    };

    private fun priceSavory(qntdSavory: Int): Int {
        val mult = qntdSavory*34;
        val result = mult/100;
        return result;
    }
};