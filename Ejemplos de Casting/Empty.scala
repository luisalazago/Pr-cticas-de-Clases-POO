package EjemplosCasting

object Empty {
    def main(args : Array[String]) {
        var paises : Map[String, Mapa] =
                     Map("Colombia" -> new Mapa("Colombia"), "Chile" -> new Mapa("Chile"))
    
        var chile : Mapa = paises.get("Peru")
        var italia : Mapa = paises.get("Italia")

        if(!chile.isEmpty) {
            println(chile.get.nombrePais + " No está vacío")
        }

        if(!italia.isEmpty) {
            println("Está vacío")
        }
    }
}