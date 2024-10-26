package com.calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testCalcularAreaCirculo() {
        double resultado = Main.calcularAreaCirculo(3);
        assertEquals(28.2743, resultado, 0.0001);
    }

    @Test
    public void testCalcularAreaCuadrado() {
        double resultado = Main.calcularAreaCuadrado(4);
        assertEquals(16, resultado);
    }

    @Test
    public void testCalcularAreaRectangulo() {
        double resultado = Main.calcularAreaRectangulo(3, 5);
        assertEquals(15, resultado);
    }

    @Test
    public void testCalcularAreaTriangulo() {
        double resultado = Main.calcularAreaTriangulo(3, 6);
        assertEquals(9, resultado);
    }
}
