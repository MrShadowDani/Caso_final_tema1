package org.example.main;

import java.util.*;

public class PlanificadorDeTareas {
    // Función para la distribución automática y optimización de tareas diarias
    public static Map<String, List<String>> distribuirYOptimizarTareas(Map<String, Integer> rendimiento, List<String> tareas) {
        Map<String, List<String>> horarios = new HashMap<>();
        // Ordenar la lista de tareas por prioridad (opcional)
        // En un escenario real, esta lógica podría ser más compleja
        Collections.sort(tareas);

        // Asignar tareas en función del rendimiento de la tripulación
        for (Map.Entry<String, Integer> entry : rendimiento.entrySet()) {
            String astronauta = entry.getKey();
            int rendimientoAstronauta = entry.getValue();
            int tareasAsignadas = rendimientoAstronauta / 10; // Ejemplo: 90 de rendimiento -> 9 tareas asignadas
            if (tareasAsignadas > tareas.size()) {
                tareasAsignadas = tareas.size();
            }
            horarios.put(astronauta, new ArrayList<>(tareas.subList(0, tareasAsignadas)));
            tareas = tareas.subList(tareasAsignadas, tareas.size());
        }
        return horarios;
    }

    // Función para visualizar horarios y cargas de trabajo
    public static void visualizarHorariosCargasTrabajo(Map<String, List<String>> horarios) {
        System.out.println("Visualizando horarios y cargas de trabajo...");
        for (Map.Entry<String, List<String>> entry : horarios.entrySet()) {
            String astronauta = entry.getKey();
            List<String> tareasAsignadas = entry.getValue();
            System.out.println("Miembro de la tripulación: " + astronauta);
            System.out.println("Tareas asignadas: " + tareasAsignadas);
        }
        System.out.println("Visualización de horarios y cargas de trabajo completada.");
    }

    // Función para realizar ajustes en tiempo real basados en el rendimiento y disponibilidad de la tripulación
    public static void ajustesEnTiempoReal(Map<String, Integer> rendimiento, Map<String, List<String>> horarios) {
        System.out.println("Realizando ajustes en tiempo real...");
        // En un escenario real, esta función podría realizar ajustes en los horarios y tareas asignadas
        // en función del rendimiento y disponibilidad actual de la tripulación.
        // Por ejemplo, reasignar tareas de astronautas con rendimiento bajo a aquellos con rendimiento alto.
        for (Map.Entry<String, Integer> entry : rendimiento.entrySet()) {
            String astronauta = entry.getKey();
            int rendimientoAstronauta = entry.getValue();
            if (rendimientoAstronauta < 50) {
                System.out.println("Reasignando tareas para " + astronauta + " debido a bajo rendimiento.");
                List<String> nuevasTareas = List.of("Tarea de baja prioridad");
                horarios.put(astronauta, nuevasTareas);
            }
        }
        System.out.println("Ajustes en tiempo real realizados con éxito.");
    }
}
