package Classes.Caminho

import Interfaces.ICaminhoNome

open class CaminhoHospedeNome : ICaminhoNome {
    private val hospede = mutableListOf<String>();

    override fun getHospede(): List<String> {
        return hospede.toList();
    }

    override fun adcionarHospede(hospede: String) {
        this.hospede.add(hospede);
    }
}