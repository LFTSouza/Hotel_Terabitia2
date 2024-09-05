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
        when {
            priceGasWayne < priceGasStark || priceAlchoolWayne < priceGasStark -> {
                if (priceGasWayne > priceAlchoolWayne) {
                    porcentCalculator(priceGasWayne, priceAlchoolWayne);
                } else if (priceGasWayne < priceAlchoolWayne) {
                    porcentCalculator(priceAlchoolWayne, priceGasWayne);
                };
            };

            priceGasWayne > priceGasStark || priceAlchoolWayne > priceGasStark -> {
                if (priceGasStark > priceAlchoolStark) {
                    porcentCalculator(priceGasStark, priceAlchoolStark);
                } else if (priceGasStark < priceAlchoolStark) {
                    porcentCalculator(priceAlchoolStark, priceGasStark);
                };
            };
        };
    };

    private fun porcentCalculator(price1: Double, price2: Double) {
        val porcent: Double;
        if (price1 > price2) {
            val sub = price1 - price2;
            porcent = sub / price1 * 100;
            if (porcent >= 30) {
                println("${Usuariobj.nome}, é mais barato abastecer com álcool no posto Wayne Oil.");
            } else {
                println("${Usuariobj.nome}, é mais barato abastecer com gasolina no posto Wayne Oil.");
            };
        } else if (price2 > price1) {
            val sub = price2 - price1;
            porcent = sub / price2 * 100;
            if (porcent >= 30) {
                println("${Usuariobj.nome}, é mais barato abastecer com álcool no posto Wayne Oil.");
            } else {
                println("${Usuariobj.nome}, é mais barato abastecer com gasolina no posto Wayne Oil.");
            };
        };
    };
};
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