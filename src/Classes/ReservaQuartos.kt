package Classes

import Classes.Menu.DaysQntDaysObj

class ReservaQuartos(
        private val pesquisarHospede: PesquisarHospede,
        private val chooseRoom: ChooseRoom
) {
    fun diarias() {
        while (true) {
            println("Qual o valor da diária?");
            val day = readln().toDouble();
            DaysQntDaysObj.day = day
            if (day <= 0) {
                println("Dado incorreto");
                diarias();
            }
            println("Quantas diarias serão necessárias");
            val qntDays = readln().toInt();
            DaysQntDaysObj.qntDays = qntDays;
            if (qntDays <= 0) {
                println("Dado incorreto");
                diarias();
            } else {
                println("O valor de $qntDays de hospedagem é de ${qntDays * day}");
                pesquisarHospede.pesquisar();
                chooseRoom.choose();
            };
        };
    };
};
