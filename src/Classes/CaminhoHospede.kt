package Classes

import Interfaces.ICaminho

open class CaminhoHospede : ICaminho {
    private val hospede = mutableListOf<String>();

    override fun getHospede(): List<String> {
        return hospede.toList();
    }

    override fun adcionarHospede(hospede: String) {
        this.hospede.add(hospede);
    }
}