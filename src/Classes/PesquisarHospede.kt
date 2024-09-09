package Classes

import Classes.Caminho.CaminhoHospedeNome
import Objects.HospedeObj.hospedeNome

class PesquisarHospede(
    private val caminho: CaminhoHospedeNome,
    private val cadastrarHospede: CadastrarHospede
) {
    fun pesquisar() {
        print("Pesquisa de Hóspedes. \nPor favor, informe o nome do Hóspede: ");
        val nome = readLine() ?: "";
        hospedeNome = nome
        if (caminho.getHospede().contains(nome)) {
            println("Encontramos o hospede");
            caminho.getHospede().filter { it.contains(nome) }.forEach(){
                println("Hospede $it foi encontrado");
            }
        } else {
            println("Não encontramos o hospede");
            cadastrarHospede.cadastro();
        };
    }
}