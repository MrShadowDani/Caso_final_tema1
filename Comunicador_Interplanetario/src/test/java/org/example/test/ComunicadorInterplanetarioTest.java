package org.example.test;

import org.example.main.ComunicadorInterplanetario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComunicadorInterplanetarioTest {
    @Test
    public void testEsPalindromo() {
        ComunicadorInterplanetario comunicador = new ComunicadorInterplanetario();
        //Prueba con un palindromo
        Assertions.assertTrue(comunicador.esPalindromo("Anita lava la tina"));
        //Prueba con un no palindromo
        Assertions.assertFalse(!comunicador.esPalindromo("Hola mundo"));
    }

    @Test
    public void testContarCaracteresEspecificos() {
        ComunicadorInterplanetario comunicador = new ComunicadorInterplanetario();
        //Prueba con un mensaje y un caracter especifico
        Assertions.assertEquals(3, comunicador.contarCaracteres("Hola mundo", 'o'));
        //Prueba con un caracter que no esta en el mensaje
        Assertions.assertEquals(0, comunicador.contarCaracteres("Hola mundo", 'x'));
    }
}
