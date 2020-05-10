package EjemplosCasting

object MapaNull extends App {
    var paises : Map[String, Mapa] =
                 Map("Colombia" -> new Mapa("Colombia"), "Chile" -> new Mapa("Chile"))
    
    println(paises.get("Colombia"))
    println(paises.get("Chile"))
}

object getOrElse extends App {
    var paises : Map[String, Mapa] =
                 Map("Colombia" -> new Mapa("Colombia"), "Chile" -> new Mapa("Chile"))
    
    var chile : Mapa = paises.get("Peru").getOrElse(new Mapa("Inexistente"))
    var italia : Mapa = paises.get("Italia").getOrElse(new Mapa("Inexistente"))
    println(peru.nombrePais)
    println(italia.nombrePais)

    var option : T = Option[T].getOrElse(new T)
    
}