import Classes.CadastrarHospede
import Classes.CaminhoHospede
import Classes.GravarHospede
import Classes.Menu.Menu
import Classes.Menu.Menureserva
import Classes.Menu.Usuario
import Classes.PesquisarHospede

fun main() {
    val caminho = CaminhoHospede();
    val usuario = Usuario();
    val menuReserva = Menureserva();
    val gravar = GravarHospede(caminho)
    val cadastro = CadastrarHospede(gravar, caminho);
    val pesquisar = PesquisarHospede(caminho);
    val menu = Menu(cadastro, pesquisar, menuReserva);
    usuario.usuario();
    menu.menu();
}