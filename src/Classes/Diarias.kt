package Classes

import Objects.DaysQntDaysObj

class Diarias {
    fun diarias() {
        println("Qual o valor da diária?");
        val day = readln().toDouble();
        DaysQntDaysObj.day = day
        if (day <= 0) {
            println("Dado incorreto");
            diarias();
        };
        println("Quantas diarias serão necessárias");
        val qntDays = readln().toDouble();
        DaysQntDaysObj.qntDays = qntDays;
        if (qntDays <= 0) {
            println("Dado incorreto");
            diarias();
        };
    };
};