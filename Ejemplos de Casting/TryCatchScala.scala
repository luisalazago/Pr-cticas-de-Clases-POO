package EjemplosCasting

import scala.util._

object TryScala extends App {
    println(division(1, 0))

    def division(n1 : Int, n2 : Int) : Try[Integer] = return Try(n1 / n2)
}

object TryScalaFunction extends App {
    var division : Try[Integer] = division(1, 1)
    division match {
        case Success(s) => println("El resultado es " + s)
        case Failure(f) => println("Error por en la opración " + f) 
    }

    if(division.isSuccess) {
        println("La división es correcta")
    }

    def division(n1 : Int, n2 : Int) : Try[Integer] = return Try(n1 / n2)
}

object consoleIOTry extends App {
    println("Digite un número: ")
    var numero1 : String = readLine()
    println("Diigite otro número: ")
    var numero2 : String = readLine()

    var division : Try[Integer] = division(numero1, numero2)
    division match {
        case Success(s) => println("El resultado es " + s)
        case Failure(f) => println("Error por en la opración " + f) 
    }

    def division(n1 : String, n2 : String) : Try[Integer] = return Try(n1.toInt / n2.toInt)
}