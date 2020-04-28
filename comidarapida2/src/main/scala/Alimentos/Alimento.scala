package Alimentos

import InsumosPlasticos._
import Servicios.GeneradorDeReferencias

abstract class Alimento extends InsumoCocina{

    /*Atributos*/
    var _tamano : TipoTamaño 
    var _descripcion : String
    var _referencia : String

    /*Getters*/
    def tamano = _tamano
    def descripcion = _descripcion
    def referencia = _referencia

    /*Setters*/
    def tamano_= (nuevoTamano : TipoTamaño) = _tamano = nuevoTamano
    def descripcion_= (nuevaDescripcion : String) = _descripcion = nuevaDescripcion
    def referencia_= (nuevaReferencia : String) = _referencia = nuevaReferencia
}