package org.example.test;

import org.example.main.CronometroCosmico;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CronometroCosmicoTest {
    @Test
    public void testConvertirTiempoDeTierraANuevoPlaneta() {
        double tiempoTierra = 365 * 24 * 60 * 60; // 1 año en segundos en la Tierra
        boolean esTierraANuevoPlaneta = true;
        double tiempoNuevoPlaneta = CronometroCosmico.convertirTiempo(tiempoTierra, esTierraANuevoPlaneta);
        Assertions.assertEquals(1, tiempoNuevoPlaneta); // El resultado debería ser 1 ciclo anual en el nuevo planeta
    }

    @Test
    public void testConvertirTiempoDeNuevoPlanetaATierra() {
        double tiempoNuevoPlaneta = 1; // 1 ciclo anual en el nuevo planeta
        boolean esTierraANuevoPlaneta = false;
        double tiempoTierra = CronometroCosmico.convertirTiempo(tiempoNuevoPlaneta, esTierraANuevoPlaneta);
        Assertions.assertEquals(365 * 24 * 60 * 60, tiempoTierra); // El resultado debería ser 1 año en segundos en la Tierra
    }

    @Test
    public void testVisualizarTiempo() {
        // Prueba de visualización de tiempo
        Assertions.assertEquals("01:02:03", CronometroCosmico.visualizarTiempo(3723, true));
    }

    @Test
    public void testVerificarLimites() {
        // Prueba de límites de representación de datos
        Assertions.assertTrue(CronometroCosmico.verificarLimites(200000));
        Assertions.assertFalse(CronometroCosmico.verificarLimites(400000000));
    }

    @Test
    public void testCalcularEdadEnNuevoPlaneta() {
        // Prueba para calcular la edad en el nuevo planeta
        double edadEsperada = 20.52;
        double edadCalculada = CronometroCosmico.calcularEdadEnNuevoPlaneta(20.52);
        Assertions.assertEquals(edadEsperada, edadCalculada, 0.01); // Acepta un margen de error de 0.01
        System.out.println("Edad calculada en el nuevo planeta: " + edadCalculada);
    }

}