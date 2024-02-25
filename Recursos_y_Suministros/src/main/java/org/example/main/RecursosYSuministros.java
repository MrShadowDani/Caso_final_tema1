package org.example.main;

import java.util.Arrays;

public class RecursosYSuministros {

    // Función para calcular el consumo de recursos vitales
    public static double calcularConsumoRecursos(double[] consumoDiario) {
        double consumoTotal = 0;
        for (double consumo : consumoDiario) {
            consumoTotal += consumo;
        }
        return consumoTotal;
    }

    // Función para predecir necesidades futuras de recursos
    public static double[] predecirNecesidades(double[] consumoDiario, int dias) {
        double[] proyeccion = new double[consumoDiario.length];
        for (int i = 0; i < consumoDiario.length; i++) {
            proyeccion[i] = consumoDiario[i] * dias;
        }
        return proyeccion;
    }

    // Función para generar alertas cuando los niveles de recursos caen por debajo de un umbral seguro
    public static boolean generarAlerta(double[] nivelesRecursos, double umbralSeguro) {
        for (double nivel : nivelesRecursos) {
            if (nivel < umbralSeguro) {
                return true; // Generar alerta si algún nivel está por debajo del umbral seguro
            }
        }
        return false;
    }

    // Función para calcular estadísticas sobre el uso de recursos
    public static double[] calcularEstadisticas(double[] nivelesRecursos) {
        double suma = 0;
        double minimo = nivelesRecursos[0];
        double maximo = nivelesRecursos[0];

        for (double nivel : nivelesRecursos) {
            suma += nivel;
            if (nivel < minimo) {
                minimo = nivel;
            }
            if (nivel > maximo) {
                maximo = nivel;
            }
        }

        double promedio = suma / nivelesRecursos.length;
        return new double[]{minimo, maximo, promedio};
    }
}
