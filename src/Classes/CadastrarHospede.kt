package Classes

import Classes.Caminho.CaminhoHospedeNome
import Classes.Gravar.GravarHospedeIdade
import Classes.Gravar.GravarHospedeNome
import Objects.DaysQntDaysObj.day
import Objects.DaysQntDaysObj.qntDays
import Objects.Usuariobj

class CadastrarHospede(
    private val gravarHospedeNome: GravarHospedeNome,
    private val gravarHospedeIdade: GravarHospedeIdade,
    private val caminhoHospedeNome: CaminhoHospedeNome,
    private val diarias: Diarias
) {
    private lateinit var novoNomeHospede: String;
    private var stop = "";
    private var soma = mutableListOf<Double>();
    private var meia = 0.0;
    private var qGratuito = 0;
    private var qmeias = 0;
    private var i = 0;

    fun cadastro() {

        diarias.diarias();

        do {
            i++
            if (i == 15) {
                println("Máximo de cadastros atingido");
                break;
            } else {
                print("Cadastro de Hóspedes. \nPor favor, informe o nome do Hóspede: ");
                novoNomeHospede = readLine() ?: "";
                gravarHospedeNome.gravarNome(novoNomeHospede);

                print("Por favor, informe a idade do Hóspede: ");
                val novoIdadeHospede = readln().toInt();

                when {
                    (novoIdadeHospede <= 0) -> {
                        println("Idade invalida");
                        cadastro();
                    };
                    (novoIdadeHospede <= 6) -> {
                        println("$novoNomeHospede possui gratuidade");
                        qGratuito++;
                    };
                    (novoIdadeHospede > 60) -> {
                        println("$novoNomeHospede paga meia");
                        meia = (day * qntDays) / 2;
                        qmeias++;
                        soma.add(meia);
                    };
                    else -> {
                        println("$novoNomeHospede paga inteira");
                        soma.add(day * qntDays);
                    };
                };

                gravarHospedeIdade.gravarIdade(novoIdadeHospede);
                println("Deseja encerrar o cadastro? Digite PARE para parar");
                stop = readln();
            }
        } while (stop != "Pare");

        println("$novoNomeHospede cadastrado com sucesso!");
        println("======//======");
        println(caminhoHospedeNome.getHospede());
        println("${Usuariobj.nome}, o valor total das hospedagens é: R$ ${soma.sum()}; $qGratuito gratuidade(s); $qmeias meia(s)");
    }
}