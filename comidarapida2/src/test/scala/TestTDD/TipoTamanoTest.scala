import org.scalatest.FunSuite
import Alimentos.TipoTamaño

class TipoTamanoTest extends FunSuite {
    
    var tipoTamano : TipoTamaño = new TipoTamaño

    test("Al crear, se asigna un ID automáticamente") {
        //fail()
        println(tipoTamano.idTam)
        assert(tipoTamano.idTam != "")
    }

    test("El ID debe tener 6 caracteres de longitud") {
        val longitud = tipoTamano.idTam.length()
        assert(longitud == 6)
    }

    test("Cuando se asigna la descripcion, el valor de la descripción no es vacío") (pending)

    test("Cuando se asigna Grande la descripción, se debe mostrar 'Grande' al solicitarla") {
        tipoTamano.descripcion = "Grande"
        assertResult("Grande") {
            tipoTamano.descripcion
        }
    }
}

