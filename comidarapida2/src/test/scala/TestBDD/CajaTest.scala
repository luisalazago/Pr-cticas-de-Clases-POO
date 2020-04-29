import org.scalatest.GivenWhenThen
import org.scalatest.FeatureSpec
import Alimentos._
import InterfazUsuario._
import InsumosPlasticos._

class CajaTest extends FeatureSpec with GivenWhenThen {

    var tipoGrande : TipoTamaño = new TipoTamaño
    var tipoMediano : TipoTamaño = new TipoTamaño
    var tipoPequeno : TipoTamaño = new TipoTamaño
    var caja : Caja = new Caja
    var referenciaPapas : String = _
    var referenciaHamburguesa : String = _
    var referenciaBebida : String = _

    tipoGrande.descripcion = "Grande"
    tipoMediano.descripcion = "Mediana"
    tipoPequeno.descripcion = "Pequeña"

    feature("Crear Alimentos") {
        scenario("Hamburguesa Normal que vale 20 mil") {
            Given("Dada una Hamburguesa Normal con valor de 20 mil") 
            var hamburguesaNormal : Hamburguesa = new Hamburguesa(tipoMediano, "Normal", 20000)
            referenciaHamburguesa = hamburguesaNormal.referencia

            When("Se agrega una hamburguesa")
            caja.agregarAlimentoAlCatalago(hamburguesaNormal) // Por qué puede generar un error con el tipo de variable??

            Then("El catálogo no se encuentra vacío")
            var catalogo : List[Alimento] = caja.mostrarCatalogo()
            assert(catalogo.length > 0)
        }
        scenario("Bebida Postobón con valor de 5 mil con tamaño grande") {
            Given("Dada una bebida Postobón de 5 mil grande")   
            var postobon : Bebida = new Bebida(tipoGrande, "Postobón de Uva", 5000)
            referenciaBebida = postobon.referencia

            When("Se agrega una bebida al catalogo de la caja")
            caja.agregarAlimentoAlCatalago(bebida)

            Then("El catálogo tiene dos elementos")
            assert(caja.mostrarCatalogo().lenght == 2)
        }
        scenario("Papas pequeñas con valor de 4000 con queso") {
            Given("Dadas unas papas pequeñas con valor de 4000 mil con queso")
            var papas : Papas = new Papas(tipoPequeno, "Papas fritas pequeñas", 4000, true)
            referenciaPapas = papas.referencia
            
            When("Se agregan las papas al catálogo de la caja")
            caja.agregarAlimentoAlCatalago(papas)

            Then("La referencia de las papas se encuentra en el catálogo")
            var catalogo : List[Alimento] = caja.mostrarCatalogo()
            var papasEncontradas = catalogo.filter(a => a.referencia == papas.referencia)
            assert(papasEncontradas.length == 1) // Es decir si encuentra una referencia es uno, sino entonces manda cero.
        }
    }

    feature("Crear Pedido") {
        scenario("Hamburguesa con papas") {
            Given("Dados dos elementos del catálogo")
            var catalogo : List[Alimento] = caja.mostrarCatalogo()
            var hamburguesa : Hamburguesa = catalogo.filter(h => h.referencia == referenciaHamburguesa).head
            var papas: Papas = catalogo.filter(p => p.referencia == referenciaPapas).head

            When("Cuando se agregan dos elementos al pedido")
            caja.agregarProductoAlPedido(hamburguesa)
            caja.agregarProductoAlPedido(papas)

            Then("El costo del pedido será igual a 24000")
            var costo : Double = caja.comprar()
            assert(costo >= 24000)
        }
        scenario("Agregar el pedido una Hamburguesa, una bebida y todo para llevar") {
            Given("Dado dos elementos del catálogo")
            var catalogo : List[Alimento] = caja.mostrarCatalogo()
            var hamburguesa : Alimento = catalogo.filter(h => h.referencia == referenciaHamburguesa).head
            var bebida: Alimento = catalogo.filter(b => b.referencia == referenciaBebida).head
            
            When("Se agregan los elementos al pedido")
            var tapaBebida : TapaBebida = new TapaBebida
            var empaque : EmpaquePlastico = new EmpaquePlastico
            var hamburguesaFinal = hamburguesa.asInstanceOf[Hamburguesa]
            hamburguesaFinal.esAgrandable = true
            caja.agregarProductoAlPedido(hamburguesaFinal)
            caja.agregarProductoAlPedido(empaque)
            caja.agregarProductoAlPedido(bebida)
            caja.agregarProductoAlPedido(tapaBebida)
            caja.agregarProductoAlPedido(bebida)
            caja.agregarProductoAlPedido(tapaBebida)

            Then("El costo será mayor a 30 mil")
            var costo : Double = caja.comprar()
            assert(costo >= 30000)
        }
    }
}