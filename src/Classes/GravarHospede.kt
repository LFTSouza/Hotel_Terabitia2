package Classes

import Interfaces.IGravar

open class GravarHospede(private val caminhoHospedeNome: CaminhoHospedeNome): IGravar {
    override fun gravar(hospede: String)
    {
        caminhoHospedeNome.adcionarHospede(hospede);
    }
}