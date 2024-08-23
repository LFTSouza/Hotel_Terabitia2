package Classes

import Classes.Menu.Usuariobj.nome

class ReservaQuartos {
    fun diarias(){
        while (true)
        {
            println("Qual o valor da diária?");
            val day = readln().toDouble();
            if(day <= 0)
            {
                println("Dado incorreto");
                diarias();
            }
            println("Quantas diarias serão necessárias");
            val qntDays = readln().toInt();
            if(qntDays <= 0){
                println("Dado incorreto");
                diarias();
            }
            println("O valor de $qntDays de hospedagem é de ${qntDays*day}");

            println("Nome do hospede");
            val nomeHospede = readln();

            val quartos =
                "1-livre; 2-livre; 3-livre; 4-livre; 5-ocupado; 6-livre; 7-ocupado; 8-livre; 9-livre; 10-livre; 11-livre; 12-livre; 13-livre; 14-livre; 15-livre; 16-livre; 17-livre; 18-livre; 19-livre; 20-ocupado"
            val rooms = quartos.split(" ").toTypedArray();
            var room: String;
            var res: String;
            var rep = true;

            rooms.forEach {
                println(it);
            };
            println("======//======");
            while (rep) {
                println("Selecione o quarto (1-20)");
                room = readln() + "-livre;";
                if (rooms.contains(room)) {
                    res = ("Livre");
                    println(res);
                    println("$nome, você confirma a hospedagem para $nomeHospede por $qntDays para o quarto $room por ${qntDays*day}?");
                    if(!readln().equals("N", ignoreCase = true )){
                        break;
                    } else{
                        println("$nome, reserva efetuada para $nomeHospede");
                    }
                    rep = false;
                } else {
                    res = ("Ocupado, escolha um quarto vago");
                    println(res);
                    println("======//======");
                }
            }
        }
    }
}