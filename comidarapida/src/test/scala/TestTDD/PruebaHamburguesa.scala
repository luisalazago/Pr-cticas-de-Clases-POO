import org.scalatest.FunSuite
import Alimentos.TipoTamaño
import Alimentos.Hamburguesa
import org.scalatest.BeforeAndAfter

class PruebaHamburguesa extends FunSuite with BeforeAndAfter {
    var TamGrande : TipoTamaño = new TipoTamaño
    var TamMediano : TipoTamaño = new TipoTamaño
    var TamPequeño : TipoTamaño = new TipoTamaño
    
    before {
        TamGrande.descripcion = "Grande"
        TamMediano.descripcion = "Mediano"
        TamPequeño.descripcion = "Pequeño"
    }
    test("Al crear hamburguesa mediana normal su costo será de 25.000$") {
        var hamburguesa : Hamburguesa = new Hamburguesa(TamMediano, "Normal", "sada21", 25000)
        hamburguesa.esAgrandable = false
        assert(hamburguesa.calcularCosto() == 25000)
    }
    test("Al crear, se crea una hamburguesa") {
        var hamburguesa : Hamburguesa = new Hamburguesa(TamMediano, "Normal", "sada21", 25000)
        assert(hamburguesa.referencia != "")
    }
}