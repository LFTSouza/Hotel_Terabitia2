package Classes.Events

import Objects.*
import Objects.DateObj.dayEvent

class ReportEvent() {

    fun report() {
        val finalHour = DateObj.hourEventFinal + DateObj.hourEvent
        println();
        println("Evento no auditório ${ColoradoOuLaranjaObj.auditorio}");
        println("Nome da empresa: ${CompanyNameObj.companyName}");
        println("Data: $dayEvent, ${DateObj.hourEvent}H às ${finalHour}H");
        when{
            finalHour < DateObj.hourEvent -> println("Duração do evento: ${DateObj.hourEvent - finalHour}H");
            finalHour > DateObj.hourEvent -> println("Duração do evento: ${finalHour - DateObj.hourEvent}H");
        }
        println("Quantidade de convidados: ${PeopleEnvitedObj.peopleEnvited}");
        println("Custo dos garçons: R$${WaiterPayment.payment}");
        println("Custo do buffet: R$${PriceBuffetObj.price}");
        println();
        println("Valor total do evento R$${WaiterPayment.payment + PriceBuffetObj.price}");

        println("Gostaria de efetuar a reserva? S/N");
        val escolha = readln().lowercase();
        reserve(escolha);
    }

    fun reserve(escohla: String) {
        when (escohla) {
            "sim" -> {
                println("${Usuariobj.nome}, reserva efetuada com sucesso!");
            }

            "não" -> {
                println("Reserva cancelada");

            }
            else -> {
                println("Digite novamente");
                reserve(readln().lowercase());
            }
        }
    }
}
