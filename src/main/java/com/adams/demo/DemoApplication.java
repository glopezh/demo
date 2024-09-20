package com.adams.demo;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        Persona[] personas = new Persona[4];
        personas[0] = new Persona ("Pepito", 40);
        personas[1] = new Persona ("Rosa", 32);
        personas[2] = new Persona ("Roberto", 48);
        personas[3] = new Persona ("Silvia", 52);

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Hola "+ personas[i].getNombre());
            System.out.println("Edad: "+ personas[i].getEdad());
        }



        //SpringApplication.run(DemoApplication.class, args);

    }

}
