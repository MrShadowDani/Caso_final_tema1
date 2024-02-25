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
        int filas = 3;
        int columnas = 3;
        double[][] terreno = new double[filas][columnas];
        NavegadorEstelar.simularTerrenosObstaculos(filas, columnas, terreno);
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
