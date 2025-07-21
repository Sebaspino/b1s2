package com.example;

public class Estadio {
    String nombre;
    String ciudad;
    int capacidad;

    void mostrarInformacion() {
        System.out.println("El estadio " + nombre + ", queda ubicado en la ciudad de " + ciudad + " y tiene una capacidad de " + capacidad + " espectadores.");
    }
}
