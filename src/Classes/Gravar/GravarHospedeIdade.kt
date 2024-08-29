package Classes.Gravar

import Classes.Caminho.CaminhoHospedeIdade
import Interfaces.IGravarIdade

open class GravarHospedeIdade(private val caminhoHospedeIdade: CaminhoHospedeIdade) : IGravarIdade {
    override fun gravarIdade(hospede: Int) {
        caminhoHospedeIdade.getAge(hospede);
    }
}