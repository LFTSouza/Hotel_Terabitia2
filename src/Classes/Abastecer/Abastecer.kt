package Classes.Abastecer

import Objects.Usuariobj

class Abastecer {
    fun abastecer() {
        println("Qual o valor do álcool no posto Wayne oil?");
        val priceAlchoolWayne = readln().toDouble();
        println("Qual o valor do gasolina no posto Wayne oil?");
        val priceGasWayne = readln().toDouble();
        println("Qual o valor do álcool no posto Stark petrol?");
        val priceAlchoolStark = readln().toDouble();
        println("Qual o valor do gasolina no posto Stark petrol?");
        val priceGasStark = readln().toDouble();
        val porcent: Double;
        when {
            priceGasWayne < priceGasStark || priceAlchoolWayne < priceGasStark -> {
                if (priceGasWayne > priceAlchoolWayne) {
                    val sub = priceGasWayne - priceAlchoolWayne;
                    porcent = sub / priceGasWayne * 100;
                    if (porcent >= 30) {
                        println("${Usuariobj.nome}, é mais barato abastecer com álcool no posto Wayne Oil.");
                    } else {
                        println("${Usuariobj.nome}, é mais barato abastecer com gasolina no posto Wayne Oil.");
                    }
                } else if (priceGasWayne < priceAlchoolWayne) {
                    val sub = priceAlchoolWayne - priceGasWayne;
                    porcent = sub / priceAlchoolWayne * 100;
                    if (porcent >= 30) {
                        println("${Usuariobj.nome}, é mais barato abastecer com álcool no posto Wayne Oil.");
                    } else {
                        println("${Usuariobj.nome}, é mais barato abastecer com gasolina no posto Wayne Oil.");
                    }
                }
            }

            priceGasWayne > priceGasStark || priceAlchoolWayne > priceGasStark -> {
                if (priceGasStark > priceAlchoolStark) {
                    val sub = priceGasStark - priceAlchoolStark;
                    porcent = sub / priceGasStark * 100;
                    if (porcent >= 30) {
                        println("${Usuariobj.nome}, é mais barato abastecer com álcool no posto Stark Petrol.");
                    } else {
                        println("${Usuariobj.nome}, é mais barato abastecer com gasolina no posto Stark Petrol.");
                    }
                } else if (priceGasStark < priceAlchoolStark) {
                    val sub = priceAlchoolStark - priceGasStark;
                    porcent = sub / priceAlchoolStark * 100;
                    if (porcent >= 30) {
                        println("${Usuariobj.nome}, é mais barato abastecer com álcool no posto Stark Petrol.");
                    } else {
                        println("${Usuariobj.nome}, é mais barato abastecer com gasolina no posto Stark Petrol.");
                    }
                }
            }
        }
    }
}
/*
* informar os valores de alcool e gasolina;
* calcular qual combustivel é mais atraente? e mais barato;
* tanque tem 42L de capacidade e sempre será o volume a ser abastecido
* Quando o alcool estiver 30% mais barato que a gasolina, é mais barato abastecer com alcool.
*
* alcool - gas = resultado
*
* resultado / maiorValor * 100 (pode ser gasolina ou alcool);
*
* */