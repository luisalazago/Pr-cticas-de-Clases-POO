package Adicionales

import Servicios.GeneradorDeReferencias

class Salsa(nombreCreacion : String) {

    /*Atributos*/
    var _referencia : String = GeneradorDeReferencias.crearReferencia()
    var _nombre : String = nombreCreacion

    /*Getters*/
    def referencia = _referencia
    def nombre = _nombre

    /*Setters*/
    def nombre_= (nuevoNombre : String) = _nombre = nuevoNombre
}