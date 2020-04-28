package Alimentos

import Servicios.GeneradorReferencias

class TipoTamaño {
    
    /*Atributos*/
    var _idTipoTam : String = GeneradorReferencias.crearReferencia()
    var _descripcion : String = _
    // this.generarId(), esto va con la otra forma.

    /*Getters*/
    def idTipoTam = _idTipoTam
    def descripcion = _descripcion

    /*Setters*/
    def descripcion_= (nuevaDescripcion : String) = _descripcion = nuevaDescripcion
    /* Con esto nos aseguramos de obtener el tamaño que quiera ingresar el usuario */

}