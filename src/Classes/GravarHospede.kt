package Classes

import Interfaces.IGravar

open class GravarHospede(private val caminhoHospede: CaminhoHospede): IGravar {
    override fun gravar(hospede: String)
    {
        caminhoHospede.adcionarHospede(hospede);
    }
}