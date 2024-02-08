class Persona (dni: String) {

    private val listaCuentas = arrayOfNulls<Cuenta>(3)
    private var numeroDeCuentas = 0

    fun nuevaCuenta(cuenta: Cuenta) {
        if (LIMITE_CUENTAS != numeroDeCuentas) {
            listaCuentas[numeroDeCuentas] = cuenta
            numeroDeCuentas++
        }
    }

    fun esMorosa(persona: Persona): Boolean {
        for (cuenta in listaCuentas) {
            if (cuenta != null) {
                if (cuenta.saldo <= 0) {
                    return true
                }
                else {
                    return false
                }
            }
            else {
                return false
            }
        }
        return false
    }

    fun transferencia(persona: Persona, numcuenta1: Int, numcuenta2: Int, cantidad: Double): Boolean {
        if (persona.esMorosa(persona)) {
            return false
        }
        else {
            var cuenta2 = persona.listaCuentas[numcuenta2]
            cuenta2?.saldo = cuenta2?.saldo?.plus(cantidad)!!
            persona.listaCuentas[numcuenta2] = cuenta2

            var cuenta1 = persona.listaCuentas[numcuenta1]
            cuenta1?.saldo = cuenta1?.saldo?.minus(cantidad)!!
            persona.listaCuentas[numcuenta1] = cuenta1
            return true
        }
    }

    companion object {
        const val LIMITE_CUENTAS = 3
    }
}