import org.scalatest.FunSuite
import Alimentos.TipoTamaño
import Alimentos.Hamburguesa

class HamburguesaTest extends FunSuite {
    test("Al crear un hamburguesa Mediana 'Normal' su costo será de 25 mil") {
        var tipoMediano : TipoTamaño = new TipoTamaño
        tipoMediano.descripcion = "Grande"
        var hamburguesa : Hamburguesa = new Hamburguesa(tipoMediano, "Normal", 25000)
        hamburguesa.esAgrandable = true
        assert(hamburguesa.calcularCosto() >= 25000) 
    }

    test("Al crear, se asigna un ID automáticamente") {
        var tipoMediano : TipoTamaño = new TipoTamaño
        tipoMediano.descripcion = "Grande"
        var hamburguesa : Hamburguesa = new Hamburguesa(tipoMediano, "Normal", 25000)
        assert(hamburguesa.referencia != "")
    }
}