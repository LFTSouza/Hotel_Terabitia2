package Classes.Caminho

import Interfaces.ICaminhoIdade

open class CaminhoHospedeIdade:ICaminhoIdade {
    private val ageLista = mutableListOf<Int>();

    override fun getAge(age: Int) {
        ageLista.add(age);
    }

    override fun setAge(): List<Int> {
        return ageLista.toList();
    }

}