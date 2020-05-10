package EjemplosCasting

object TryJava extends App {
    println(division(1, 0))

    def division(n1 : Int, n2 : Int) : Integer = {
        var result : Int = 0

        try {
            result = n1 / n2
        }
        catch {
            case e : Throwable => println("No se puede dividir por cero.")
        }

        return result
    }
}