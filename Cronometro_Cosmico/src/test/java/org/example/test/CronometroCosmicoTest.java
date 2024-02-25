package org.example.test;

import org.example.main.CronometroCosmico;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CronometroCosmicoTest {
    @Test
    public void testConvertirTiempo() {
        // Prueba de conversión de tiempo de la Tierra al nuevo planeta
        Assertions.assertEquals(182.5, CronometroCosmico.convertirTiempo(365, true));
        // Prueba de conversión de tiempo del nuevo planeta a la Tierra
        Assertions.assertEquals(365, CronometroCosmico.convertirTiempo(182.5, false));
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
}