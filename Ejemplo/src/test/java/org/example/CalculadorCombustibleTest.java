package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorCombustibleTest {


    private CalculadorCombustible calculador;
    @BeforeEach
    public void setup(){
        calculador = CalculadorCombustible.getInstance();
    }


    @Test
    public void testCalcularConsumoAvionComercialRetorna5000() {
        Avion avion = new AvionComercial(100, 10);
        int consumo = calculador.calcularCombustible(avion, 500);
        assertEquals(5000, consumo);
    }

    @Test
    public void testCalcularConsumoAvionPrivadoRetorna2600() {
        Avion avion = new AvionPrivado(100, 10);
        int consumo = calculador.calcularCombustible(avion, 255);
        assertEquals(2600, consumo);
    }

    @Test
    public void testGetInstanceRetornaMismaInstancia() {
        CalculadorCombustible instance2 = CalculadorCombustible.getInstance();
        assertEquals(calculador, instance2);
    }
}
