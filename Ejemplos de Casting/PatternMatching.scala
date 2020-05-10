package EjemplosCasting

object PatternMatching extends App {
    var option : Int = 1

    option match {
        case 0 => println("Opción 0")
        case 1 => println("Opción 1")
        case _ => println("Opción x")
    }
}

object PatternMatching2 extends App {
    var paises : Map[String, Mapa] =
                 Map("Colombia" -> new Mapa("Colombia"), "Chile" -> new Mapa("Chile"))
    
    var chile : Mapa = paises.get("Peru").getOrElse(new Mapa("Inexistente"))
    var italia : Mapa = paises.get("Italia").getOrElse(new Mapa("Inexistente"))
    println(peru.nombrePais(chile))
    println(italia.nombrePais(italia))

    def nombrePais(mapa : Option[Mapa]) = mapa match {
        case Some(s) => s.nombrePais
        case None => "El país no existe"
    }
}

class Pais {
    // Atributos
    private var _nombrePais : Option[String] = None

    // Getters
    def nombrePais = _nombrePais match {
        case Some(s) => s
        case None => "El país no tiene nombre"
    }

    // Setters
    def nombrePais_(nombre : String) = _nombrePais = Option(nombre)
}

object getterOption extends App {
    var pais : Pais = new Pais
    println(pais.nombrePais)
    pais.nombrePais_("Colombia")
    println(pais.nombrePais)
}