package Classes

import Classes.Caminho.CaminhoRooms
import Objects.DaysQntDaysObj.day
import Objects.DaysQntDaysObj.qntDays
import Objects.HospedeObj.hospedeNome
import Objects.Usuariobj

class ChooseRoom(private val caminhoRooms: CaminhoRooms) {
    fun choose() {
        caminhoRooms.setRoom().forEach(::println);
        var rep = true;
        println("======//======");
        while (rep) {
            println("Selecione o quarto (1-20)");
            val room = readln() + "-livre;";
            if (caminhoRooms.setRoom().contains(room)) {
                println("Livre");
                println("${Usuariobj.nome}, você confirma a hospedagem para $hospedeNome por $qntDays para o quarto ${room.removeSuffix("-livre;")} por ${qntDays * day}? S para sim/N para não");
                when {
                    readln().equals("S", ignoreCase = true) -> println("${Usuariobj.nome}, reserva efetuada para $hospedeNome");
                    readln().equals("N", ignoreCase = true) -> break;
                }
                rep = false;
            } else {
                println("Ocupado, escolha um quarto vago");
                println("======//======");
            };
        };
    };
};