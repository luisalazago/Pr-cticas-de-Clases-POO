import org.scalatest.GivenWhenThen
import org.scalatest.FeatureSpec
import Alimentos._
import InterfazUsuario._

class CajaTest extends FeatureSpec with GivenWhenThen {

    var tipoGrande : TipoTamaño = new TipoTamaño
    var tipoMediano : TipoTamaño = new TipoTamaño
    var tipoPequeno : TipoTamaño = new TipoTamaño
    var caja : Caja = new Caja

    tipoGrande.descripcion = "Grande"
    tipoMediano.descripcion = "Mediana"
    tipoPequeno.descripcion = "Pequeña"

    feature("Crear Hamburguesa") {
        scenario("Hamburguesa Normal que vale 20 mil") {
            Given("Dada una Hamburguesa Normal con valor de 20 mil") 
            var hamburguesaNormal : Hamburguesa = new Hamburguesa(tipoMediano, "Normal", 20000)

            When("Se agrega una hamburguesa")
            caja.agregarAlimentoAlCatalago(hamburguesaNormal) // Por qué puede generar un error con el tipo de variable??

            Then("El catálogo no se encuentra vacío")
            var catalogo : List[Alimento] = caja.mostrarCatalogo()
            assert(catalogo.length > 0)
        }
    }
}