package org.example.test;


import org.example.main.ComunicadorInterplanetario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComunicadorInterplanetarioTest {

    @Test
    public void testEsPalindromo() {
        ComunicadorInterplanetario comunicador = new ComunicadorInterplanetario();
        // Prueba con un palíndromo
        Assertions.assertTrue(comunicador.esPalindromo("Anita lava la tina"));
        // Prueba con un no palíndromo
        Assertions.assertFalse(comunicador.esPalindromo("Hola mundo"));
    }

    @Test
    public void testContarCaracteresEspecificos() {
        ComunicadorInterplanetario comunicador = new ComunicadorInterplanetario();
        // Prueba con un mensaje y un carácter específico
        Assertions.assertEquals(3, comunicador.contarCaracteres("Hola mundo", 'o'));
        // Prueba con un carácter que no está en el mensaje
        Assertions.assertEquals(0, comunicador.contarCaracteres("Hola mundo", 'x'));
    }

    @Test
    public void testEnviarYRecibirMensaje() {
        ComunicadorInterplanetario comunicador = new ComunicadorInterplanetario();
        // Enviar un mensaje a un destino y recibirlo
        comunicador.enviarMensaje("¡Hola desde Marte!", "Marte");
        String mensajeRecibido = comunicador.recibirMensaje("Marte");
        Assertions.assertEquals("¡Hola desde Marte!", mensajeRecibido, "El mensaje recibido no coincide con el enviado a Marte");
        // Intentar recibir un mensaje de un origen sin mensajes pendientes
        mensajeRecibido = comunicador.recibirMensaje("Tierra");
        Assertions.assertEquals("No hay mensajes pendientes de Tierra", mensajeRecibido, "El mensaje de Tierra no coincide con el esperado");
    }
}

