package Classes

class ReservaQuartos(
    private val pesquisarHospede: PesquisarHospede,
    private val chooseRoom: ChooseRoom,
    private val diarias: Diarias
) {
    fun diarias() {
            diarias.diarias();
            pesquisarHospede.pesquisar();
            chooseRoom.choose();
        };
    };