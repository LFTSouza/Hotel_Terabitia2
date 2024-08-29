package Classes.Events

import Objects.PeopleEnvitedObj
import Objects.BuffetObj

class Buffet (
    private val priceBuffet: PriceBuffet
) {
    fun buffet() {
        val coffe = qntcoffe(PeopleEnvitedObj.peopleEnvited);
        BuffetObj.coffe = coffe;
        val water = qntWater(PeopleEnvitedObj.peopleEnvited);
        BuffetObj.water = water;
        val savory = qntSavory(PeopleEnvitedObj.peopleEnvited);
        BuffetObj.savory = savory;
        println("O evento precisará de $coffe litros de café, $water litros de água, $savory salgados");
        priceBuffet.price();
    };

    private fun qntcoffe(qntdEnvited: Int):Double {
        val qntdCafe = qntdEnvited * 0.2;
        return qntdCafe
    };

    private fun qntWater(qntdEnvited: Int): Double {
        val qntdWater = qntdEnvited * 0.5;
        return qntdWater
    };

    private fun qntSavory(qntdEnvited: Int): Int {
        val qntdSavory = qntdEnvited * 7
        return qntdSavory
    };
};

/*
* café: 200ml/convidado;
* Agua: 500ml/convidado;
* 7 salgados/convidado.
* */