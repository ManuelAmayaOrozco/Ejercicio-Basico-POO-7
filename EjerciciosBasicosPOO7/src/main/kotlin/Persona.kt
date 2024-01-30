class Persona (dni: String) {

    val listaCuentas = arrayOfNulls<Cuenta>(3)

    fun nuevaCuenta(cuenta: Cuenta) {
        var cuentaVacia = listaCuentas.filter { it == null}
        
    }

    companion object {
        const val LIMITE_CUENTAS = 3
    }
}