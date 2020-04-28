package Alimentos

import Servicios.GeneradorReferencias

class Hamburguesa extends Alimentos {
    /*Atributos*/
    override var _tamaño : TipoTamaño = _
    override var _descripcion : String = _
    override var _referencia : String = GeneradorReferencias.crearReferencia()
    override var _costo : Double = _ 
    var _esAgrandable : Boolean = false

    /*Constructor Auxiliar*/
    def this(t : TipoTamaño, d : String, c : Double) {
        this()
        _tamaño = t
        _descripcion = d 
        _costo = c 
    }

    /*Getter*/
    def esAgrandable = _esAgrandable

    /*Setter*/
    def esAgrandable_= (desicionUsuario : Boolean) = _esAgrandable = desicionUsuario

    /*Métodos*/
    def calcularCosto() : Double = {
        if(_esAgrandable) {
            _costo = _costo + (_costo * 0.2) 
        }
        return _costo
    }
}