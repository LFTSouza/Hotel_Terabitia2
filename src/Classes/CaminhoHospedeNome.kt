package Classes

import Interfaces.ICaminho

open class CaminhoHospedeNome : ICaminho {
    private val hospede = mutableListOf<String>();

    override fun getHospede(): List<String> {
        return hospede.toList();
    }

    override fun adcionarHospede(hospede: String) {
        this.hospede.add(hospede);
    }
}