package Classes

import Classes.Menu.Menu

class PesquisarHospede(private val gravado: GravarHospede) {

    fun pesquisar() {
        val hospede = gravado.getHospede();

        print("Pesquisa de Hóspedes. \nPor favor, informe o nome do Hóspede: ");
        val nome = readLine() ?: "";
        if (hospede.contains(nome)) {
            println("Encontramos o hospede");
            hospede.filter { it.contains(nome) }.forEach(::println);
        } else {
            println("Não encontramos o hospede");
        }
        Menu().menu();
    }
}