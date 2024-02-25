package org.example.test;

import org.example.main.PlanificadorDeTareas;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class PlanificadorDeTareasTest {

    @Test
    public void testDistribuirYOptimizarTareas() {
        // Creamos datos de ejemplo
        List<String> tareas = Arrays.asList("Tarea1", "Tarea2", "Tarea3", "Tarea4", "Tarea5", "Tarea6", "Tarea7");
        Map<String, Integer> rendimiento = new HashMap<>();
        rendimiento.put("Astronauta1", 90);
        rendimiento.put("Astronauta2", 85);
        rendimiento.put("Astronauta3", 95);

        // Ejecutamos la función que queremos probar
        Map<String, List<String>> horarios = PlanificadorDeTareas.distribuirYOptimizarTareas(rendimiento, tareas);

        // Verificamos si la función retorna un valor válido
        assertNotNull(horarios);

        // Agregamos más verificaciones si es necesario
    }

    @Test
    public void testVisualizarHorariosCargasTrabajo() {
        // Creamos datos de ejemplo
        Map<String, List<String>> horarios = new HashMap<>();
        horarios.put("Astronauta1", Arrays.asList("Tarea1", "Tarea2", "Tarea3"));
        horarios.put("Astronauta2", Arrays.asList("Tarea4", "Tarea5"));
        horarios.put("Astronauta3", Arrays.asList("Tarea6", "Tarea7", "Tarea8"));

        // Ejecutamos la función que queremos probar
        assertDoesNotThrow(() -> PlanificadorDeTareas.visualizarHorariosCargasTrabajo(horarios));

        // Agregamos más verificaciones si es necesario
    }

    @Test
    public void testAjustesEnTiempoReal() {
        // Creamos datos de ejemplo
        Map<String, Integer> rendimiento = new HashMap<>();
        rendimiento.put("Astronauta1", 90);
        rendimiento.put("Astronauta2", 85);
        rendimiento.put("Astronauta3", 95);

        Map<String, List<String>> horarios = new HashMap<>();
        horarios.put("Astronauta1", Arrays.asList("Tarea1", "Tarea2", "Tarea3"));
        horarios.put("Astronauta2", Arrays.asList("Tarea4", "Tarea5"));
        horarios.put("Astronauta3", Arrays.asList("Tarea6", "Tarea7", "Tarea8"));

        // Ejecutamos la función que queremos probar
        assertDoesNotThrow(() -> PlanificadorDeTareas.ajustesEnTiempoReal(rendimiento, horarios));

        // Agregamos más verificaciones si es necesario
    }
}