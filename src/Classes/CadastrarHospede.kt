package Classes

import Classes.Menu.Menu

class CadastrarHospede {

    private val hospede = GravarHospede();
    private var sair = true;

    fun cadastro() {
        val menu = Menu();

        while (sair) {
            print("Cadastro de Hóspedes. \nPor favor, informe o nome do Hóspede: ");
            val novoHospede = readLine() ?: "";
            hospede.adcionarHospede(novoHospede);
            println("$novoHospede cadastrado com sucesso!");
            println(hospede.getHospede());
            sair = false;
        }
        menu.menu();
    }
}