package Adicionales

import Servicios.GeneradorReferencias

class Salsa(nombreCreacion : String) {
    /*Atributos*/
    var _referencia : String = GeneradorReferencias.crearReferencia()
    var _nombre : String = nombreCreacion

    /*Getters*/
    def referencia = _referencia
    def nombre = _nombre

    /*Setters*/
    def nombre_= (nuevoNombre : String) = _nombre = nuevoNombre
}