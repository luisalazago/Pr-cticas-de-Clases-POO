package Alimentos

import Servicios.GeneradorDeReferencias

class Bebida extends Alimento {

    /*Atributos*/
    override var _tamano : TipoTamaño = _ 
    override var _descripcion : String = _
    override var _referencia : String = GeneradorDeReferencias.crearReferencia()
    override var _costo : Double = _
    var _conHielo : Boolean = true

    /*Constructor Auxiliar*/
    def this(t : TipoTamaño, d : String, c : Double) {
        this()
        _tamano = t 
        _descripcion = d 
        _costo = c
    }

    /*Getters*/
    def conHielo = _conHielo

    /*Setters*/
    def conHielo_= (nuevoHielo : Boolean) = _conHielo = nuevoHielo

    /*Métodos*/
    def calcularCosto() : Double = return _costo
}