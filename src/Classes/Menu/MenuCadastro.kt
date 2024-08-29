package Classes.Menu

import Classes.CadastrarHospede
import Classes.Caminho.CaminhoHospedeNome
import Classes.PesquisarHospede
import Classes.ShowNames

class MenuCadastro(
    private val cadastrarHospede: CadastrarHospede,
    private val pesquisarHospede: PesquisarHospede,
    private val showNames: ShowNames,
) {
    fun menuCadastro() {
        while (true) {
            println("Selecione uma opção:\n1.) Cadastrar\n2.) Pesquisar\n3.) Listar\n4.) Sair");

            val escolha = readOption();

            when (escolha) {
                1 -> cadastrarHospede.cadastro();
                2 -> pesquisarHospede.pesquisar();
                3 -> showNames.mostrar();
                4 -> {
                    println("Você deseja sair? S/N")
                    if (readLine()?.equals("S", ignoreCase = true) == true) {
                        break
                    }
                }

                else -> println("Por favor, informe um número entre 1 e 3");
            }
        }
    }

    private fun readOption(): Int {
        while (true) {
            print("Digite uma opção: ");
            val input = readLine()?.toIntOrNull() ?: 0;
            if (input in 1..4) {
                return input!!
            } else {
                println("Opção invalida. Por favor, digite um numero valido");
            }
        }
    }
}