package Classes

import Classes.Caminho.CaminhoHospedeNome

class ShowNames(
    private val caminhoHospedeNome: CaminhoHospedeNome
) {
    fun mostrar(){
        caminhoHospedeNome.getHospede().forEach(::println)
    }
}