package org.example.test;

import org.example.main.NavegadorEstelar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NavegadorEstelarTest {
    @Test
    public void testPlanificarRutasConstrucciones() {
        System.out.println("Test de planificación de rutas y construcciones...");
        NavegadorEstelar.planificarRutasConstrucciones();
        // Como este método solo imprime mensajes, no podemos verificar nada en particular.
        // Solo verificamos que no haya excepciones al ejecutar el método.
    }

    @Test
    public void testSimularTerrenosObstaculos() {
        System.out.println("Test de simulación de terrenos y obstáculos...");
        double[][] terreno = {
                {0.5, 0.3, 0.8},
                {0.1, 0.2, 0.6},
                {0.9, 0.7, 0.4}
        };
        NavegadorEstelar.simularTerrenosObstaculos(terreno);
        // Como este método solo imprime mensajes, no podemos verificar nada en particular.
        // Solo verificamos que no haya excepciones al ejecutar el método.
    }

    @Test
    public void testOptimizarRutas() {
        System.out.println("Test de optimización de rutas...");
        NavegadorEstelar.optimizarRutas();
        // Como este método solo imprime mensajes, no podemos verificar nada en particular.
        // Solo verificamos que no haya excepciones al ejecutar el método.
    }

    @Test
    public void testGenerarTerreno() {
        System.out.println("Test de generación de terreno...");
        int filas = 5;
        int columnas = 5;
        double[][] terreno = NavegadorEstelar.generarTerreno(filas, columnas);
        assertNotNull(terreno);
        assertEquals(filas, terreno.length);
        assertEquals(columnas, terreno[0].length);
        // Verificamos que la matriz generada tenga las dimensiones correctas.
    }
}
