package Alimentos

import Servicios.GeneradorReferencias

class Papas extends Alimentos {
    /*Atributos*/
    override var _tamaño : TipoTamaño = _
    override var _descripcion : String = _
    override var _referencia : String = GeneradorReferencias.crearReferencia()
    override var _costo : Double = _ 
    var _conQueso : Boolean = _

    /*Constructor Auxiliar*/
    def this(t : TipoTamaño, d : String, c : Double, queso : Boolean) {
        this()
        _tamaño = t
        _descripcion = d 
        _costo = c
        _conQueso = queso 
    }

    /*Getter*/
    def conQueso = _conQueso

    /*Setter*/
    def conQueso_= (desicionUsuario : Boolean) = _conQueso = desicionUsuario

    /*Métodos*/
    def calcularCosto() : Double = {
        if(_conQueso) {
            _costo = _costo + (_costo * 0.12) 
        }
        return _costo
    }
}