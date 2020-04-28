package Alimentos

import InsumosPlasticos.InsumoCocina

abstract class Alimentos extends InsumoCocina {
    /*Atributos*/
    var _tamaño : TipoTamaño
    var _descripcion : String
    var _referencia : String

    /*Getters*/
    def tamaño = _tamaño
    def descripcion = _descripcion
    def referencia = _referencia

    /*Setters*/
    def tamaño_= (nuevoTamaño : TipoTamaño) = _tamaño = nuevoTamaño
    def descripcion_= (nuevoDescripcion : String) = _descripcion = nuevoDescripcion
    def referencia_= (nuevoReferencia : String) = _referencia = nuevoReferencia
}