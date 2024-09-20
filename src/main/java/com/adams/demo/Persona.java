package com.adams.demo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Persona {

    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

}
