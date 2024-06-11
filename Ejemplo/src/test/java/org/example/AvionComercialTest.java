package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvionComercialTest {

    private Avion avion;
    @BeforeEach
    public void setup(){
        avion = new AvionComercial(100, 10);
    }

    @Test
    public void testCalcularConsumoAvionComercialRetorna50() {
        int consumo = avion.volar(5);
        assertEquals(50, consumo);
    }

    @Test
    public void testObtenerConsumoCombustibleRetorna10() {
        int consumo = avion.getConsumoCombustible();
        assertEquals(10, consumo);
    }

}
