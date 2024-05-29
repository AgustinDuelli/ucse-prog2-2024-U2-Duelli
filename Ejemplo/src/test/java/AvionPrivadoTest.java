import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvionPrivadoTest {
    @Test
    public void testCalcularConsumoAvionPrivadoRetorna450() {
        Avion avion = new AvionPrivado(100, 20);
        int consumo = avion.volar(20);
        assertEquals(450, consumo);
    }

    @Test
    public void testObtenerConsumoCombustibleRetorna300() {
        Avion avion = new AvionComercial(100, 300);
        int consumo = avion.getConsumoCombustible();
        assertEquals(300, consumo);
    }
}
