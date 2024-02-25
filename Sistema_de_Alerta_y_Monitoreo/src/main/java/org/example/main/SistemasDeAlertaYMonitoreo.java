package org.example.main;

import java.util.Arrays;

public class SistemasDeAlertaYMonitoreo {
    // Método para monitorear constantemente variables ambientales críticas
    public static void monitorearVariablesAmbientales(double[] variables) {
        // Implementación de la lógica para monitorear variables ambientales críticas
        for (double variable : variables) {
            // Lógica para identificar y notificar eventos raros o críticos
            if (esNumeroPrimo((int) variable)) {
                System.out.println("¡Alerta! Número primo detectado: " + (int) variable);
            }
        }
    }

    // Método para verificar si un número es primo
    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para descomponer un número en factores primos
    public static int[] descomponerEnFactoresPrimos(int numero) {
        // Implementación de la lógica para descomponer un número en factores primos
        int[] factores = new int[numero];
        int indice = 0;
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                factores[indice++] = i;
                numero /= i;
            }
        }
        return Arrays.copyOf(factores, indice);
    }
}
