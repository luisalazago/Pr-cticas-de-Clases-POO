package Servicios

import scala.util.Random

object GeneradorReferencias {
    /*Métodos*/
    def crearReferencia() : String = {
        var codigo : String = Random.alphanumeric.take(6).mkString("")
        return codigo
    }
}