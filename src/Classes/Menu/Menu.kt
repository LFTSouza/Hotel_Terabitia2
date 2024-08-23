package Classes.Menu

import Classes.CadastrarHospede
import Classes.PesquisarHospede

class Menu(private val cadastrarHospede: CadastrarHospede, private val pesquisarHospede: PesquisarHospede) {

    private val nomeHotel = "Sauble"
    private var interrompe = true;

    fun menu() {

        println("Seja bem-vinda(o) ao hotel $nomeHotel, ${Usuariobj.nome} É um prazer ter você por aqui!");

        while (interrompe) {
            println("\nCadastro de Hóspedes\n\n Selecione uma opção: \n1. Cadastrar \n2. Pesquisar \n3. Sair");
            val escolha = readLine()?.toIntOrNull() ?: 0;
            when (escolha) {
                1 -> cadastrarHospede.cadastro();
                2 -> pesquisarHospede.pesquisar()
                3 -> {
                    println("Você deseja sair? S/N")
                    if (readLine()?.equals("S", ignoreCase = true) == true) {
                        println("Muito obrigado e até logo, ${Usuariobj.nome}");
                        interrompe = false;
                    }
                }

                else -> println("Por favor, informe um número entre 1 e 3")
            }
        }
    }
}
