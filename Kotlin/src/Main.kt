fun sumarDosNumeros(numeroUno: Int, numeroDos: Int): Int{
    return numeroUno+numeroDos
}

fun main(args: Array<String>){
    println("Hola Mundo") //system.out
    println(sumarDosNumeros(1,2))

    var nombre: String? = "Marcelo"
    var edadActual = 22
    var casado = false
    //duck typing
    casado = true
    nombre = null

    val superHeroe = if (casado){
        "SuperMandarina"
    }else{
        "Superman"
    }
    //template Strings
    println("SuperHeroe: ${superHeroe}")

    when(casado){
        true -> {
            println("esta casado")
        }
        else -> {
            println("No esta casado")
        }
    }


}