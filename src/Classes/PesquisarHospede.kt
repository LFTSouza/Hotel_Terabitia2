package Classes

import Classes.Menu.HospedeObj.hospedeNome

class PesquisarHospede(private val caminho: CaminhoHospedeNome) {
    fun pesquisar() {
        print("Pesquisa de Hóspedes. \nPor favor, informe o nome do Hóspede: ");
        val nome = readLine() ?: "";
        hospedeNome = nome
        if (caminho.getHospede().contains(nome)) {
            println("Encontramos o hospede");
            caminho.getHospede().filter { it.contains(nome) }.forEach(::println)
        } else println("Não encontramos o hospede");
    }
}