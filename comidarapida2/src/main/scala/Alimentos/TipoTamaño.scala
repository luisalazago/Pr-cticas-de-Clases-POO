package Alimentos

import Servicios.GeneradorDeReferencias

import scala.util.Random

class TipoTamaño {

    /*Atributos*/
    var _idTam : String = GeneradorDeReferencias.crearReferencia() // Esto es un singleton porque solo va a funcionar una vez dentro de todo el programa.
    var _descripcion : String = _

    /*Getters*/
    def idTam = _idTam
    def descripcion = _descripcion

    /*Setters*/
    def descripcion_= (nuevaDescripcion : String) = _descripcion = nuevaDescripcion
}