package com.example;

public class ejercicio01 {
    public static void main(String[] args) {
        Estadio estadio1 = new Estadio();
        estadio1.nombre = "Metropolitano";
        estadio1.ciudad = "Barranquilla";
        estadio1.capacidad = 46692;

        Estadio estadio2 = new Estadio();
        estadio2.nombre = "El Campin";
        estadio2.ciudad = "Bogota";
        estadio2.capacidad = 39000;

       // Método
       estadio1.mostrarInformacion();
       estadio2.mostrarInformacion();
    
    }
}