package org.example.test;

import org.example.main.RecursosYSuministros;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecursosYSuministrosTest {

    @Test
    public void testCalcularConsumoRecursos() {
        double[] consumoDiario = {10.5, 8.2, 15.0, 12.7};
        double consumoTotal = RecursosYSuministros.calcularConsumoRecursos(consumoDiario);
        assertEquals(46.4, consumoTotal);
    }

    @Test
    public void testPredecirNecesidades() {
        double[] consumoDiario = {10.5, 8.2, 15.0, 12.7};
        double[] proyeccion = RecursosYSuministros.predecirNecesidades(consumoDiario, 5);
        assertArrayEquals(new double[]{52.5, 41.0, 75.0, 63.5}, proyeccion);
    }

    @Test
    public void testGenerarAlerta() {
        double[] nivelesRecursos = {20.0, 15.0, 25.0, 10.0};
        assertFalse(RecursosYSuministros.generarAlerta(nivelesRecursos, 30.0));
        assertTrue(RecursosYSuministros.generarAlerta(nivelesRecursos, 12.0));
    }

    @Test
    public void testCalcularEstadisticas() {
        double[] nivelesRecursos = {20.0, 15.0, 25.0, 10.0};
        double[] estadisticas = RecursosYSuministros.calcularEstadisticas(nivelesRecursos);
        assertArrayEquals(new double[]{10.0, 25.0, 17.5}, estadisticas);
    }
}
