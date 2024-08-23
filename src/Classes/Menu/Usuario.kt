package Classes.Menu

class Usuario {

    fun usuario() {
        var usuario = "";
        print("Insira o seu usuario: ");
        usuario = readln();
        Usuariobj.nome = usuario;
        print("Insira sua senha: ");
        val senha = readln().toInt();
        if (senha != 2687) {
            println("Senha incorreta");
            usuario();
        }
    }
}