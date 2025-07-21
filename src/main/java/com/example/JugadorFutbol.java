package com.example;

public class JugadorFutbol {
    String nombre;
    int edad;
    String posicion;
    String nuevaPosicion;

    void presentarse() {
        System.out.println("Soy " + nombre + ", juego como " + posicion + " y tengo " + edad + " años de edad.");
    }

    // Método para cambiar de posición
    void cambiarPosicion() {
        System.out.println(nombre + " ahora juega como: " + nuevaPosicion + ".");
    }
}
