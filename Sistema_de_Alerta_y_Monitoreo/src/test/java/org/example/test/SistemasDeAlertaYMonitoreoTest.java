package org.example.test;

import org.example.main.SistemasDeAlertaYMonitoreo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SistemasDeAlertaYMonitoreoTest {

    @Test
    public void testDescomponerEnFactoresPrimos() {
        int numero = 60;
        int[] factoresPrimos = SistemasDeAlertaYMonitoreo.descomponerEnFactoresPrimos(numero);
        assertArrayEquals(new int[]{2, 2, 3, 5}, factoresPrimos);
    }

    @Test
    public void testEsNumeroPrimo() {
        assertTrue(SistemasDeAlertaYMonitoreo.esNumeroPrimo(17));
    }
}