package Classes

class GravarHospede {
    private val hospede = mutableListOf<String>();

    fun getHospede(): List<String> {
        return hospede.toList();
    }

    fun adcionarHospede(hopede: String) {
        hospede.add(hopede);
    }
}