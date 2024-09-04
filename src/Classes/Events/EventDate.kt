package Classes.Events

import Objects.CompanyNameObj
import Objects.DateObj
import Objects.DateObj.dayEvent
import Objects.DateObj.hourEvent

class EventDate(
    private val waiter: Waiter
) {
    private var companyName = "";

    fun confirmDate() {
        when {
            (dayEvent.equals("sabado") || dayEvent.equals("domingo")) -> {
                if (hourEvent > 15 || hourEvent < 7) {
                    println("Auditório indisponivel")
                    confirmDate();
                } else if (DateObj.hourEventFinal < 15) {
                    println("Auditório disponivel");
                    println("Qual o nome da empresa");
                    companyName = readLine() ?: "";
                    CompanyNameObj.companyName = companyName;
                    available(companyName);
                    waiter.waiterHour();
                } else {
                    println("Auditório indisponivel")
                    confirmDate();
                }
            }

            else -> {
                if (hourEvent > 23 || hourEvent < 7) {
                    println("Auditório indisponivel");
                    confirmDate();
                } else if (DateObj.hourEventFinal < 23) {
                    println("Auditório disponivel");
                    println("Qual o nome da empresa");
                    companyName = readLine() ?: "";
                    CompanyNameObj.companyName = companyName;
                    available(companyName);
                    waiter.waiterHour();
                } else {
                    println("Auditório indisponivel");
                    confirmDate();
                }
            }
        }
    }

    private fun available(company: String) {
        println("Auditório reservado para $company $dayEvent às $hourEvent");
    }
}
