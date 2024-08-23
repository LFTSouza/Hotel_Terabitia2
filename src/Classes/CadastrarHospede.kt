package Classes

class CadastrarHospede(private val gravarHospede: GravarHospede,
                       private val caminhoHospede: CaminhoHospede)
{

    fun cadastro() {
            print("Cadastro de Hóspedes. \nPor favor, informe o nome do Hóspede: ");
            val novoHospede = readLine() ?: "";
            gravarHospede.gravar(novoHospede);
            println("$novoHospede cadastrado com sucesso!");
            println(caminhoHospede.getHospede());
    }
}