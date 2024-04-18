package org.ies.tierno;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        // Crea el mensaje "Este es un mensaje de depuración" con nivel debug en los log
        log.debug("Este es un mensaje de depuración");
        // Crea el mensaje "Este es un mensaje informativo" con nivel warning en los log
        log.info("Este es un mensaje informativo");
        // Crea el mensaje "Este es un mensaje de advertencia" con nivel warning en los log
        log.warn("Este es un mensaje de advertencia");
    }
}