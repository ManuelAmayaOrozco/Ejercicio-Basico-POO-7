class Cuenta(val numero: Int, saldo: Double = 0.0) {

    var saldo = saldo
    private set

    /**
     * Función consultarSaldo
     *
     * Función que muestra el saldo actual.
     *
     * @return Muestra el saldo actual.
     */
    fun consultarSaldo(): String {
        return "El saldo actual es de $saldo€."
    }

    /**
     * Función recibirAbono
     *
     * Función que añade el dinero proporcionado por el abono al saldo actual.
     *
     * @param saldo El dinero que será añadido.
     *
     * @return Mensaje que avisa tras la finalización del abono.
     */
    fun recibirAbono(abono: Double): String {
        saldo += abono
        return "Abono realizado con éxito. (Saldo actual: $saldo€)"
    }

    /**
     * Función realizarPago
     *
     * Función que retira el dinero solicitado por el pago.
     *
     * @param pago El dinero que será retirado.
     *
     * @return Mensaje que avisa tras la finalización del pago.
     */
    fun realizarPago(pago: Double): String {
        saldo -= pago
        return "Pago realizado con éxito. (Saldo actual: $saldo€)"
    }

    override fun toString(): String {
        return "Cuenta número $numero con saldo $saldo€."
    }
}