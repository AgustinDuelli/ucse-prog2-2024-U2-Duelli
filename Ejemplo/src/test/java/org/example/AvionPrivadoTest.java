package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvionPrivadoTest {

    private Avion avion;
    @BeforeEach
    public void setup(){
        avion = new AvionPrivado(100, 20);
    }

    @Test
    public void testCalcularConsumoAvionPrivadoRetorna450() {
        int consumo = avion.volar(20);
        assertEquals(450, consumo);
    }

    @Test
    public void testObtenerConsumoCombustibleRetorna300() {
        int consumo = avion.getConsumoCombustible();
        assertEquals(20, consumo);
    }
}
