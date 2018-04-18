fun sumarDosNumeros(numeroUno: Int, numeroDos: Int): Int {
    return numeroUno + numeroDos
}

fun main(args: Array<String>) {
//    println("Hola Mundo") //system.out
//    println(sumarDosNumeros(1, 2))

    var nombre: String? = "Marcelo"
    var edadActual = 22
    var casado = false
    //duck typing
    casado = true
    nombre = null
    var marcelo = Persona(Integer(22),"Marcelo")
    println(marcelo.toString())

    var marcelo2 = PersonaDos(Integer(22),"Marcelo","1715925739")
    println(marcelo2.toString())

    var marcelo3 = PersonaDos(Integer(22),"Marcelo","1715925739",false)
    println(marcelo3.toString())

    var cuadrado1 = Cuadrado("cuadrado", Integer(5))
    println(cuadrado1.toString())
//    val superHeroe = if (casado) {
//        "SuperMandarina"
//    } else {
//        "Superman"
//    }
//    //template Strings
//    println("SuperHeroe: ${superHeroe}")
//
//    when (casado) {
//        true -> {
//            println("esta casado")
//        }
//        else -> {
//            println("No esta casado")
//        }
//    }
}

class Persona {
    lateinit var edadActual: Integer
    var nNombre: String

    constructor(edad: Integer, nombre:String) {
        iniciar(edad)
        nNombre = nombre
    }

    fun iniciar(edad: Integer) {
        edadActual = edad
    }
    override fun toString():String{
        return "La edad actual es $edadActual y el nombre es $nNombre"
    }
}

class PersonaDos (edad:Integer,nombre:String){
    var nEdad = edad
    var nNombre = nombre
    var nCedula: String? = null
    var nCasado: Boolean? = null

    constructor(edad2:Integer, nombre2:String, cedula:String):this (edad2,nombre2){
        nCedula = cedula
    }
    constructor(edad3:Integer, nombre3:String, cedula2:String, casado:Boolean):this (edad3,nombre3){
        nCedula = cedula2
        nCasado = casado
    }

    override fun toString():String{
        return "La edad es $nEdad , el nombre es $nNombre, el numero de cedula es $nCedula y esta casado: $nCasado"
    }
}

class PersonaTres (edad:Integer,nombre:String){
    lateinit var nEdad: Integer
    var nNombre = nombre
    init{ //codigo despues del constructor
        iniciar(edad)
    }

    fun iniciar(edad: Integer) {
        nEdad = edad
    }
}

open class Figura(nombre:String){
    val nNombre = nombre
}

class Cuadrado(nombre:String, valorLado: Integer):Figura(nombre){
    var nValorLado = valorLado
    override fun toString():String{
        return "La figura es $nNombre, y el valor del lado es: $nValorLado"
    }
}