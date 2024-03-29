package org.example.main;

public class CronometroCosmico {
    // Ciclo anual del nuevo planeta en segundos
    private static final double CICLO_ANUAL_SEGUNDOS = 31536000.0; // 365 días * 24 horas * 60 minutos * 60 segundos

    // Función para convertir tiempo entre la Tierra y el nuevo planeta
    public static double convertirTiempo(double tiempo, boolean esTierraANuevoPlaneta) {
        double cicloOrigen = esTierraANuevoPlaneta ? CICLO_ANUAL_SEGUNDOS : 1.0; // Ciclo del planeta de origen
        double cicloDestino = esTierraANuevoPlaneta ? 1.0 : CICLO_ANUAL_SEGUNDOS; // Ciclo del planeta de destino

        return tiempo * (cicloDestino / cicloOrigen);
    }

    // Función para visualizar el tiempo en diferentes formatos
    public static String visualizarTiempo(double tiempo, boolean esTierraANuevoPlaneta) {
        // Implementar logica para visualizar el tiempo en varios formatos segun necesidades de los astronautas
        // Por ejemplo, en horas, minutos y segundos
        int horas = (int) (tiempo / 3600);
        int minutos = (int) ((tiempo % 3600) / 60);
        int segundos = (int) (tiempo % 60);
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    // Función para identificar los limites de representacion de datos
    public static boolean verificarLimites(double tiempo) {
        // Implementar logica para verificar si el tiempo esta dentro de los limites de representacion
        // Por ejemplo, si el tiempo excede cierto valor maximo o minimo
        return tiempo >= 0 && tiempo <= CICLO_ANUAL_SEGUNDOS;
    }

    // Función para calcular la edad en el nuevo planeta dado un tiempo de vida en la Tierra
    public static double calcularEdadEnNuevoPlaneta(double edadTierra) {
        // Calculamos la edad en el nuevo planeta utilizando la conversión de tiempo
        double edadNuevoPlaneta = convertirTiempo(edadTierra * 365 * 24 * 60 * 60, true); // Convertimos de la Tierra al nuevo planeta
        // Redondeamos a dos decimales para obtener un valor más legible
        return Math.round(edadNuevoPlaneta * 100.0) / 100.0;
    }
}
