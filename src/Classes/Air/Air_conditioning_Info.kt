package Classes.Air

class Air_conditioning_Info {
    fun info(): AirconditioningData{
        println("Qual o valor por aparelho?");
        val valuePerDevice = readln().toDouble();

        println("Quantidade de aparelhos?");
        val qntdDevice = readln().toInt();

        return AirconditioningData(qntdDevice, valuePerDevice);
    }
}