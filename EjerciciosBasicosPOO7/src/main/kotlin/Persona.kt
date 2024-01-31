class Persona (dni: String) {

    val listaCuentas = arrayOfNulls<Cuenta>(3)
    private var numeroDeCuentas = 0

    fun nuevaCuenta(cuenta: Cuenta) {
        if (LIMITE_CUENTAS != numeroDeCuentas) {
            listaCuentas[numeroDeCuentas] = cuenta
            numeroDeCuentas++
        }
    }

    companion object {
        const val LIMITE_CUENTAS = 3
    }
}