package org.example.main;

public class CronometroInterplanetario {
    //Ciclo diario del nuevo planeta en segundos
    private static final long CICLO_DIARIO_SEGUNDOS = 86400;

    //Ciclo anual del nuevo planeta en segundos
    private static final long CICLO_ANUAL_SEGUNDOS = 31536000; // 365 días * 24 horas * 60 minutos * 60 segundos

    //Funcion para convertir tiempo entre la Tierra y el nuevo planeta
    public static double convertirTiempo(double tiempo, boolean esTierraANuevoPlaneta) {
        if (esTierraANuevoPlaneta) {
            //Conversion de tiempo de la Tierra al nuevo planeta
            return tiempo * CICLO_ANUAL_SEGUNDOS / CICLO_DIARIO_SEGUNDOS;
        } else {
            //Conversion de tiempo del nuevo planeta a la Tierra
            return tiempo * CICLO_DIARIO_SEGUNDOS / CICLO_ANUAL_SEGUNDOS;
        }
    }

    //Funcion para visualizar el tiempo en diferentes formatos
    public static String visualizarTiempo(double tiempo, boolean esTierraANuevoPlaneta) {
        //Implementar logica para visualizar el tiempo en varios formatos segun necesidades de los astronautas
        //Por ejemplo, en horas, minutos y segundos
        int horas = (int) (tiempo / 3600);
        int minutos = (int) ((tiempo % 3600) / 60);
        int segundos = (int) (tiempo % 60);
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    //Funcion para identificar los limites de representacion de datos
    public static boolean verificarLimites(double tiempo) {
        //Implementar logica para verificar si el tiempo esta dentro de los limites de representacion
        //Por ejemplo, si el tiempo excede cierto valor maximo o minimo
        return tiempo >= 0 && tiempo <= CICLO_ANUAL_SEGUNDOS;
    }
}
