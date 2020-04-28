package Alimentos

import Servicios.GeneradorReferencias

class Bebida extends Alimentos {
    /*Atributos*/
    override var _tamaño : TipoTamaño = _
    override var _descripcion : String = _
    override var _referencia : String = GeneradorReferencias.crearReferencia()
    override var _costo : Double = _ 
    var _conHielo : Boolean = false

    /*Constructor Auxiliar*/
    def this(t : TipoTamaño, d : String, c : Double) {
        this()
        _tamaño = t
        _descripcion = d  
        _costo = c 
    }

    /*Getter*/
    def conHielo = _conHielo

    /*Setter*/
    def conHielo_= (desicionUsuario : Boolean) = _conHielo = desicionUsuario

    /*Métodos*/
    def calcularCosto() : Double = {
        if(_conHielo) {
            _costo = _costo + (_costo * 0.16) 
        }
        return _costo
    }
}