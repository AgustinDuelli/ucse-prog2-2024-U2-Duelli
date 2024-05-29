import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorCombustibleTest {

    // Setup with CalculadorCombustible

    @Test
    public void testCalcularConsumoAvionComercialRetorna5000() {
        CalculadorCombustible calculador = CalculadorCombustible.getInstance();
        Avion avion = new AvionComercial(100, 10);
        int consumo = calculador.calcularCombustible(avion, 500);
        assertEquals(5000, consumo);
    }

    @Test
    public void testCalcularConsumoAvionPrivadoRetorna2600() {
        CalculadorCombustible calculador = CalculadorCombustible.getInstance();
        Avion avion = new AvionPrivado(100, 10);
        int consumo = calculador.calcularCombustible(avion, 255);
        assertEquals(2600, consumo);
    }

    @Test
    public void testGetInstanceRetornaMismaInstancia() {
        CalculadorCombustible instance = CalculadorCombustible.getInstance();
        CalculadorCombustible instance2 = CalculadorCombustible.getInstance();
        assertEquals(instance, instance2);
    }
}
