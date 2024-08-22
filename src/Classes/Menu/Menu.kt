package Classes.Menu

import Classes.CadastrarHospede
import Classes.GravarHospede
import Classes.PesquisarHospede

class Menu {

    private val nomeHotel = "Sauble"
    private var interrompe = true;
    private val gravador = GravarHospede();
    private val pesquisa = PesquisarHospede(gravador);
    private val cadastro = CadastrarHospede();

    fun menu() {


        println("Seja bem-vinda(o) ao hotel $nomeHotel, ${Usuariobj.nome} É um prazer ter você por aqui!");
        println("\nCadastro de Hóspedes\n\n Selecione uma opção: \n1. Cadastrar \n2. Pesquisar \n3. Sair");

        val escolha = readLine()?.toIntOrNull() ?: 0

        while (interrompe) {
            when (escolha) {
                1 -> cadastro.cadastro();
                2 -> pesquisa.pesquisar();
                3 -> {
                    println("Você deseja sair? S/N")
                    if (readLine()?.equals("S", ignoreCase = true) == true) {
                        println("Muito obrigado e até logo, ${Usuariobj.nome}");
                        interrompe = false
                    }
                }

                else -> println("Por favor, informe um número entre 1 e 3")
            }
        }
    }
}
