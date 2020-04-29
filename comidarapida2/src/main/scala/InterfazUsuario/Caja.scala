package InterfazUsuario

import Adicionales._
import InsumosPlasticos._
import Alimentos._

class Caja {

    /*Atributos*/
    private var _pedido : List[InsumoCocina] = List() // Cómo es agregación se hacen listas vacías.
    private var _catalogo : List[Alimento] = List()
    private var _catalogoSalsas : List[Salsa] = List()
    private var _tiposTamano : List[TipoTamaño] = List()

    /*Métodos*/
    def agregarProductoAlPedido(insumo : InsumoCocina) : Unit = _pedido = insumo :: _pedido
    def agregarAlimentoAlCatalago(alimento : Alimento) : Unit = _catalogo = alimento :: _catalogo
    def agregarSalsaCatalogo(salsa : Salsa) : Unit = _catalogoSalsas = salsa :: _catalogoSalsas
    def agregarTamano(tamano : TipoTamaño) : Unit = _tiposTamano = tamano :: _tiposTamano
    
    def comprar() : Double = {
        var costoTotal : Double = 0
        _pedido.foreach{p =>
            {
                costoTotal += p.calcularCosto()
            }
        }
        _pedido = List()
        return costoTotal
    }
    def mostrarCatalogo() : List[Alimento] = _catalogo
    def mostrarSalsas() : List[Salsa] = _catalogoSalsas
    def mostrarTamanos() : List[TipoTamaño] = _tiposTamano
}