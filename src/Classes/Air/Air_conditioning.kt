package Classes.Air;

import Objects.Usuariobj

class Air_conditioning {

    private val companyCase = mutableListOf<String>();
    private val minorValue = mutableListOf<Double>();

    fun company() {
        do {
            println("Qual o nome da empresa?");
            val comapny_name = readln();
            companyCase.add(comapny_name);

            val airconditioningData = Air_conditioning_Info().info();
            val totalPrice = totalPrice(airconditioningData)
            val discount = discount(totalPrice, airconditioningData);

            println("O serviço de $comapny_name custará $discount");

            print("Deseja informar novos dados, ${Usuariobj.nome}? (S/N): ");
            val choise = readln().lowercase();
            println();
        } while (choise != "n");

        val lowestPriceIndex = minorValue.indexOf(minorValue.minOrNull());
        val lowestPriceCompany = companyCase[lowestPriceIndex];
        val lowesPrice = minorValue[lowestPriceIndex];

        println("Orçamento de menor valor é o $lowestPriceCompany por R$$lowesPrice");
    };

    private fun totalPrice(airconditioningData: AirconditioningData):Double{
        val totalPrice = airconditioningData.value * airconditioningData.quantity;
        return totalPrice;
    };

    private fun discount(totalPrice: Double, airconditioningData: AirconditioningData): Double {
        println("Porcentagem de desconto?");
        val discount = readln().toDouble() / 100;
        println("Quantidade minima de aparelhos para conseguir desconto?");
        val minDevice = readln().toInt();

        if (minDevice <= airconditioningData.quantity) {
            val discountPrice = totalPrice * discount;
            minorValue.add(discountPrice);
            return discountPrice;
        } else {
            println("Desconto não aplicavel");
            val notDiscount = totalPrice;
            minorValue.add(notDiscount);
            return notDiscount;
        };
    };

};

/*

 */