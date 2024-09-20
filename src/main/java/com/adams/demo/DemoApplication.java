package com.adams.demo;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        Persona pepito = new Persona ("Pepito", 40);

        System.out.println("Hola "+ pepito.getNombre());
        System.out.println("Edad: "+ pepito.getEdad());

        //SpringApplication.run(DemoApplication.class, args);

    }

}
