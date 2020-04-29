package InterfazUsuario

import scala.io
import Alimentos._
import Adicionales._
import InsumosPlasticos._

class InterfazUsuario extends app{
    var cerrarTienda : Boolean = false
    private var caja : Caja = new Caja

    while(!cerrarTienda) {
        println("Bienvenido a la local de comidas rápidas!")
        println("Sus opciones son: ")
        println("========================================")
        println("1. Crear Alimento \n 2. Mostrar Catálogo")
        println("Escoger: ")
        var opcion : String = Std.readline()
        if(opcion == 1) {
            crearAlimentoCatalogo()
        }
        caja.mostrarCatalogo().foreach(p => println(p.descripcion + " " + p.referencia))
    }

    def crearAlimentoCatalogo() : Unit = {
        println("¿Qué alimento desea crear?:  ")
        println("====================================")
        println("1. Hamburguesa \n 2. Bebida \n 3. Papas")
        var comida : String = Std.readline()

        if(comida == 1) {
            println("Coloque el nombre de su Hamburguesa:")
            var nombre : String = Std.readline()
            println("Coloque el precio de su Hamburguesa:")
            var precio : Double = Std.readline()
            var tamano = elegirTamaño()
            var hamburguesa : Hamburguesa = new Hamburguesa(tamano, nombre, precio)
            caja.agregarAlimentoAlCatalago(hamburguesa)
        }

    }

    def elegirTamaño() : TipoTamaño = {
        var tamanos : List[TipoTamaño] = caja.mostrarTamanos()
        println("Tamaños Actuales: ")
        tamanos.foreach{t => 
            {
                println("Referencia: " + t.idTam + "Descripción: " + t.descripcion)
            }
        }
        println("Escriba la referencia de su tamaño: ")
        var referencia : String = Std.readline()
        var tamanoElejida : TipoTamaño = tamanos.filter(t => t.idTam = referencia).head
        return tamanoElejida
    }
}