package Alimentos

import Servicios.GeneradorDeReferencias

class Papas extends Alimento {

    /*Atributos*/
    override var _tamano : TipoTamaño = _ 
    override var _descripcion : String = _
    override var _referencia : String = GeneradorDeReferencias.crearReferencia()
    override var _costo : Double = _
    var _conQueso : Boolean = _

    /*Constructor Auxiliar*/
    def this(t : TipoTamaño, d : String, c : Double, q : Boolean) {
        this()
        _tamano = t 
        _descripcion = d 
        _costo = c
        _conQueso = q
    }

    /*Getters*/
    def conQueso = _conQueso

    /*Setters*/
    def conQueso_= (nuevoQueso : Boolean) = _conQueso = nuevoQueso

    /*Métodos*/
    def calcularCosto() : Double = {
        if(_conQueso) {
            _costo = _costo + (_costo * 0.18)            
        }
        return _costo
    }
}