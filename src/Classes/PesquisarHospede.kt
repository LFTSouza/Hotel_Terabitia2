package Classes

import Classes.Menu.Menu

class PesquisarHospede(private val caminho: CaminhoHospede) {

    fun pesquisar() {
        print("Pesquisa de Hóspedes. \nPor favor, informe o nome do Hóspede: ");
        val nome = readLine() ?: "";
        if (caminho.getHospede().contains(nome)) {
            println("Encontramos o hospede");
            caminho.getHospede().filter { it.contains(nome) }.forEach(::println)
        } else {
            println("Não encontramos o hospede");
        }
    }
}