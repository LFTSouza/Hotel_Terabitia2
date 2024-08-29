package Classes.Gravar

import Classes.Caminho.CaminhoHospedeNome
import Interfaces.IGravarNome

open class GravarHospedeNome(private val caminhoHospedeNome: CaminhoHospedeNome) : IGravarNome {
    override fun gravarNome(hospede: String) {
        caminhoHospedeNome.adcionarHospede(hospede);
    }
}