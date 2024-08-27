import Classes.*
import Classes.Menu.Menu
import Classes.Menu.Menureserva
import Classes.Menu.Usuario

fun main() {
    val caminho = CaminhoHospede();
    val caminhoRooms = CaminhoRooms();
    val usuario = Usuario();
    val chooseRoom = ChooseRoom(caminhoRooms);
    val gravar = GravarHospede(caminho)
    val cadastro = CadastrarHospede(gravar, caminho);
    val pesquisar = PesquisarHospede(caminho);
    val reservaQuartos = ReservaQuartos(pesquisar, chooseRoom);
    val menuReserva = Menureserva(reservaQuartos);
    val menu = Menu(cadastro, pesquisar, menuReserva);
    usuario.usuario();
    menu.menu();
}