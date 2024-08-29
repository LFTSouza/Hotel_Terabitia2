package Classes.Menu

import Classes.Events.EventDate
import Classes.Events.EventOrganization
import Classes.ReservaQuartos

class Menureserva(
    private val reservaQuartos: ReservaQuartos,
    private val menuCadastro: MenuCadastro,
    private val eventOrganization: EventOrganization
) {
    fun menuReservas() {
        while (true) {
            println("Selecione uma opção:\n1.) Reserva de Quartos\n2.) Cadastro de Hóspedes\n3.) Abastecimento de Carros\n4.) Eventos\n5.) Sair");

            val escolha = readLine()?.toIntOrNull() ?: 0

            when (escolha) {
                1 -> reservaQuartos.diarias();
                2 -> menuCadastro.menuCadastro();
                3 -> println("HOTEL {NOME DO HOTEL} - ABASTECER");
                4 -> eventOrganization.location();
                5 -> {
                    println("Você deseja sair? S/N")
                    if (readLine()?.equals("S", ignoreCase = true) == true) {
                        break;
                    }
                }

                else -> println("Por favor, informe um número entre 1 e 4")
            }
        }
    }
}