package EjemplosCasting

import scala.io._

object CastingPrimitivo extends App {
    // Casting
    var i : Int = 41
    obtenerNombreDeLaClase(i)
    var j = i.asInstanceOf[Double]
    obtenerNombreDeLaClase(j)
    var k = i.asInstanceOf[Char]
    obtenerNombreDeLaClase(k)

    var pollo3 : Pollo = new Pollo // Con clases diferentes a las convencionales
    pollo3.volar(11) 
    obtenerNombreDeLaClase(pollo3)
    var pollo4 = pollo3.asInstanceOf[Ave]
    pollo4.volar(25) // Esto aplica como polimorfismo
    obtenerNombreDeLaClase(pollo4)

    def obtenerNombreDeLaClase[T](x : T) { println(x.getClass.getName) }

    // Reflexión
    println("Digite un nombre: ")
    var nombreClase : String = Stdin.readline()
    val foo = Class.forName(nombreClase) // Crea el nombre de una clase.
    val bar = foo.newInstance() // Crea una nueva instancia de clase.
    val ter = bar.asInstanceOf[Pollo] // Transforma la clase.
    println(foo)
    println(bar)
    println(ter)
    ter.volar(4)
}