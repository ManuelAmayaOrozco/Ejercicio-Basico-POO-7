fun main(args: Array<String>) {
    val persona = Persona("Hola")

    val cuenta1 = Cuenta(1, 0.0)
    val cuenta2 = Cuenta(2, 700.0)

    persona.nuevaCuenta(cuenta1)
    persona.nuevaCuenta(cuenta2)

    cuenta1.recibirAbono(1100.0)
    cuenta2.realizarPago(750.0)
    persona.esMorosa(persona)

    persona.transferencia(persona, 1, 2, 100.0)
}