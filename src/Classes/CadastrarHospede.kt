package Classes

class CadastrarHospede(private val gravarHospede: GravarHospede,
                       private val caminhoHospedeNome: CaminhoHospedeNome
) {
    fun cadastro() {
        print("Cadastro de Hóspedes. \nPor favor, informe o nome do Hóspede: ");
        val novoHospede = readLine() ?: "";
        gravarHospede.gravar(novoHospede);
        println("$novoHospede cadastrado com sucesso!");
        println(caminhoHospedeNome.getHospede());
    }
}