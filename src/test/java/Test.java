import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Ejercicio2Test {

    @Test
    public void testCalcularArea() {
        Ejercicio2 ejercicio = new Ejercicio2(2.0f);
        // Invocar el método de cálculo
        ejercicio.calcularArea();
        // Verificar que el estado después del cálculo sea correcto
        assertEquals(Math.PI * Math.pow(2.0, 2), ejercicio.getArea(), 0.00001);
    }

    @Test
    public void testCalcularVolumen() {
        Ejercicio2 ejercicio = new Ejercicio2(2.0f);
        // Invocar el método de cálculo
        ejercicio.calcularVolumen();
        // Verificar que el estado después del cálculo sea correcto
        assertEquals((4.0 / 3.0) * Math.PI * Math.pow(2.0, 3), ejercicio.getVolumen(), 0.00001);
    }
}
