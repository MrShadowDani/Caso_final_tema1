package org.example;

import java.util.HashMap;
import java.util.Map;

public class ComunicadorInterplanetario {

    //Estructura de datos para almcacenar los mensajes
    private Map<String, String> mensajes;
    public ComunicadorInterplanetario() {
        mensajes = new HashMap<>();
    }

    //Funcion para enviar un mensaje
    public void enviarMensaje(String mensaje, String destino) {
        // Aquí podrías implementar la lógica para enviar el mensaje al destino correspondiente
        mensajes.put(destino, mensaje);
    }

    //Funcion para recibir un mensaje
    public String recibirMensaje(String origen) {
        // Aquí podrías implementar la lógica para recibir el mensaje del origen correspondiente
        return mensajes.getOrDefault(origen, "No hay mensajer recibidos de " + origen);
    }

    //Funcion para verificar verificar si un mensaje es un palindromo
    public boolean esPalindromo(String mensaje) {
        //Eliminamos los espacios y convertimos todo a minusculas para simplificar la verificacion
        mensaje = mensaje.replaceAll("\\s", "").toLowerCase();
        int longitud = mensaje.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (mensaje.charAt(i) != mensaje.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }

    //Funcion para contar caracteres especificos en un mensaje
    public int contarCaracteres(String mensaje, char caracter) {
        int contador = 0;
        for (char c : mensaje.toCharArray()) {
            if (c == caracter) {
                contador++;
            }
        }
        return contador;
    }
}
