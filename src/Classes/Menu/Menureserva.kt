package Classes.Menu

import Classes.Abastecer.Abastecer
import Classes.Air.Air_conditioning
import Classes.Events.EventDate
import Classes.Events.EventOrganization
import Classes.ReservaQuartos

class Menureserva(
    private val reservaQuartos: ReservaQuartos,
    private val menuCadastro: MenuCadastro,
    private val eventOrganization: EventOrganization,
    private val abastecer: Abastecer,
    private val airConditioning: Air_conditioning
) {
    fun menuReservas() {
        while (true) {
            println("Selecione uma opção:\n1.) Reserva de Quartos\n2.) Cadastro de Hóspedes\n3.) Abastecimento de Carros\n4.) Eventos\n5.) Ar-Condicionado\n" +
                    "6.) Sair");

            val escolha = readLine()?.toIntOrNull() ?: 0

            when (escolha) {
                1 -> reservaQuartos.diarias();
                2 -> menuCadastro.menuCadastro();
                3 -> abastecer.abastecer();
                4 -> eventOrganization.location();
                5 -> airConditioning.company();
                6 -> {
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