import Classes.*
import Classes.CadastrarHospede
import Classes.Caminho.CaminhoHospedeIdade
import Classes.Caminho.CaminhoHospedeNome
import Classes.Caminho.CaminhoRooms
import Classes.Events.EventDate
import Classes.Events.EventDates
import Classes.Gravar.GravarHospedeIdade
import Classes.Gravar.GravarHospedeNome
import Classes.Menu.Menu
import Classes.Menu.MenuCadastro
import Classes.Menu.Menureserva
import Classes.Menu.Usuario

fun main() {
    val caminhoNome = CaminhoHospedeNome();
    val caminhoIdade = CaminhoHospedeIdade();
    val gravarHospedeIdade = GravarHospedeIdade(caminhoIdade);
    val diarias = Diarias();
    val eventDates = EventDates();
    val event = EventDate(eventDates);
    val showNames = ShowNames(caminhoNome);
    val caminhoRooms = CaminhoRooms();
    val usuario = Usuario();
    val chooseRoom = ChooseRoom(caminhoRooms);
    val gravar = GravarHospedeNome(caminhoNome);
    val cadastro = CadastrarHospede(gravar, gravarHospedeIdade, caminhoNome, diarias);
    val pesquisar = PesquisarHospede(caminhoNome);
    val reservaQuartos = ReservaQuartos(pesquisar, chooseRoom, diarias);
    val menuCadastro = MenuCadastro(cadastro, pesquisar, showNames);
    val menuReserva = Menureserva(reservaQuartos, menuCadastro, event);
    val menu = Menu(cadastro, pesquisar, menuReserva);

    usuario.usuario();
    menu.menu();
}