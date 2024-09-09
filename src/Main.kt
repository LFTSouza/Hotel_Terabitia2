import Classes.*
import Classes.Abastecer.Abastecer
import Classes.Air.Air_conditioning
import Classes.CadastrarHospede
import Classes.Caminho.CaminhoHospedeIdade
import Classes.Caminho.CaminhoHospedeNome
import Classes.Caminho.CaminhoRooms
import Classes.Events.*
import Classes.Gravar.GravarHospedeIdade
import Classes.Gravar.GravarHospedeNome
import Classes.Menu.Menu
import Classes.Menu.MenuCadastro
import Classes.Menu.Menureserva
import Classes.Menu.Usuario
import Objects.PriceBuffetObj

fun main() {
    val caminhoNome = CaminhoHospedeNome();
    val caminhoIdade = CaminhoHospedeIdade();
    val gravarHospedeIdade = GravarHospedeIdade(caminhoIdade);
    val diarias = Diarias();
    val reportEvent = ReportEvent();
    val priceBuffet = PriceBuffet(reportEvent);
    val buffet = Buffet(priceBuffet);
    val waiter = Waiter(buffet);
    val eventDate = EventDate(waiter);
    val eventDates = EventDates(eventDate);
    val eventOraganiation = EventOrganization(eventDates);
    val showNames = ShowNames(caminhoNome);
    val caminhoRooms = CaminhoRooms();
    val usuario = Usuario();
    val chooseRoom = ChooseRoom(caminhoRooms);
    val gravar = GravarHospedeNome(caminhoNome);
    val cadastro = CadastrarHospede(gravar, gravarHospedeIdade, caminhoNome, diarias);
    val pesquisar = PesquisarHospede(caminhoNome, cadastro);
    val reservaQuartos = ReservaQuartos(pesquisar, chooseRoom, diarias);
    val menuCadastro = MenuCadastro(cadastro, pesquisar, showNames);
    val abastecer = Abastecer();
    val airConditioning = Air_conditioning();
    val menuReserva = Menureserva(reservaQuartos, menuCadastro, eventOraganiation, abastecer, airConditioning);
    val menu = Menu(cadastro, pesquisar, menuReserva);

    usuario.usuario();
    menu.menu();
}