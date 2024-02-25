package org.example.main;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ComunicadorInterplanetario {

    private static final Logger logger = LoggerFactory.getLogger(ComunicadorInterplanetario.class);

    private final Map<String, String> mensajes;
    private final Map<String, Integer> retardoPorDestino;

    public ComunicadorInterplanetario() {
        mensajes = new HashMap<>();
        retardoPorDestino = new HashMap<>();
    }

    public void enviarMensaje(String mensaje, String destino) {
        int retardo = (int) (Math.random() * 10) + 1; // Retardo aleatorio entre 1 y 10 segundos
        retardoPorDestino.put(destino, retardo);
        try {
            Thread.sleep((long) retardo * 1000); // Convertir 1000 a long
            mensajes.put(destino, mensaje);
        } catch (InterruptedException e) {
            logger.error("Error al dormir el hilo", e);
            Thread.currentThread().interrupt(); // Restaura la bandera de interrupción
        }
    }

    public String recibirMensaje(String destino) {
        if (!mensajes.containsKey(destino)) {
            return "No hay mensajes pendientes de " + destino;
        }
        int retardo = retardoPorDestino.getOrDefault(destino, 0);
        try {
            Thread.sleep((long) retardo * 1000); // Convertir 1000 a long
        } catch (InterruptedException e) {
            logger.error("Error al dormir el hilo", e);
            Thread.currentThread().interrupt(); // Restaura la bandera de interrupción
        }
        return mensajes.remove(destino);
    }

    public boolean esPalindromo(String mensaje) {
        mensaje = mensaje.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int longitud = mensaje.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (mensaje.charAt(i) != mensaje.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public int contarCaracteres(String mensaje, char caracter) {
        return (int) mensaje.chars().filter(ch -> ch == caracter).count();
    }
}
