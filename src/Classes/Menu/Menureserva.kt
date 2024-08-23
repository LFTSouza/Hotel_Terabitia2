package Classes.Menu

class Menureserva {
    fun menuReservas() {
        while (true) {
            println("Selecione uma opção:\n1.) Reserva de Quartos\n2.) Cadastro de Hóspedes\n3.) Abastecimento de Carros\n4.) Sair")

            val escolha = readLine()?.toIntOrNull() ?: 0

            when (escolha) {
                1 -> println("HOTEL {NOME DO HOTEL} - RESERVA DE QUARTOS")
                2 -> println("HOTEL {NOME DO HOTEL} - CADASTRO DE HÓSPEDES")
                3 -> println("HOTEL {NOME DO HOTEL} - ABASTECER")
                4 -> {
                    println("Você deseja sair? S/N")
                    if (readLine()?.equals("S", ignoreCase = true) == true) {
                        break
                    }
                }

                else -> println("Por favor, informe um número entre 1 e 4")
            }
        }
    }
}