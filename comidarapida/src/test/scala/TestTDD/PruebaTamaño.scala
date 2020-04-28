import org.scalatest.FunSuite
import Alimentos.TipoTamaño

class PruebaTamaño extends FunSuite {
    var tipoTam : TipoTamaño = new TipoTamaño

    test("Al crear se asigna un ID automaticamente") {
        //fail(), se obliga a fallar.
        assert(tipoTam.idTipoTam != "")
    }
    /* Con lo anterior nos sirve para hacer pruebas con lo que se lleva de código
       para probar si sirve o no. (Prueba en la forma TDD)*/

    test("El ID debe tener 6 caracteres de longitud") {
        val longitud = tipoTam.idTipoTam.length()
        assert(longitud == 6)
    }

    test("Cuando se asigna la descripcion, el valor de la descripcion no es vacío") {pending}

    test("Cuando se asigna Grande a la descripcion, se debe mostrar 'Grande'") {
        tipoTam.descripcion = "Grande"
        assertResult("Grande") {
            tipoTam.descripcion
        }
        /* Con esto compara si el valor de llegada es igual al valor que debería tener
           por salida. */
    }
}