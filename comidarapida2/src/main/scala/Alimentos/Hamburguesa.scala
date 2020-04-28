package Alimentos

import Servicios.GeneradorDeReferencias

class Hamburguesa extends Alimento {

    /*Atributos*/
    override var _tamano : TipoTamaño = _ 
    override var _descripcion : String = _
    override var _referencia : String = GeneradorDeReferencias.crearReferencia()
    override var _costo : Double = _
    var _esAgrandable : Boolean = false

    /*Constructor Auxiliar*/
    def this(t : TipoTamaño, d : String, c : Double) {
        this()
        _tamano = t 
        _descripcion = d 
        _costo = c
    }

    /*Getters*/
    def esAgrandable = _esAgrandable

    /*Setters*/
    def esAgrandable_= (desicionUsuario : Boolean) = _esAgrandable = desicionUsuario

    /*Métodos*/
    def calcularCosto() : Double = {
        if(_esAgrandable) {
            _costo = _costo + (_costo * 0.2)            
        }
        return _costo
    }
}