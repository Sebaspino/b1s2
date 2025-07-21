package com.example;

public class ejercicio02 {
    public static void main(String[] args) {
        JugadorFutbol jugador1 = new JugadorFutbol();
        jugador1.nombre = "Luis Díaz";
        jugador1.posicion = "Delantero";
        jugador1.nuevaPosicion = "Mediocentro";
        jugador1.edad = 35;

        JugadorFutbol jugador2 = new JugadorFutbol();
        jugador2.nombre = "Juan Cuadrado";
        jugador2.posicion = "Mediocampista";
        jugador2.nuevaPosicion = "Interior";
        jugador2.edad = 22;

        // Métodos
        jugador1.presentarse();
        jugador1.cambiarPosicion();
        jugador2.presentarse();
        jugador2.cambiarPosicion();
    }
}
