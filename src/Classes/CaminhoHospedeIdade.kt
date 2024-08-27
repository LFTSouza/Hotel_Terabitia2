package Classes

class CaminhoHospedeIdade {
    private val ageLista = mutableListOf<Int>();

    fun getAge(age: Int) {
        ageLista.add(age);
    }

    fun setAge(): List<Int> {
        return ageLista.toList();
    }

}