package edu.advanced.inheritance;

import java.sql.Connection;
import java.util.Date;

public class Main {

    public static void mostrarArea(Figura figura) {
        System.out.println("El area de la figura es: " + figura.area());
    }
    
    public static void main(String[] args) {
        // Temporal empleadoTemporal = new Temporal("Michael Jackson", 10, "111", 200.00, 
        // new Date(), new Date());
        
        // //System.out.println("Nombre: " + );
        // empleadoTemporal.mostrar();

        Cuadrado cuadro = new Cuadrado(1,2,3);
        System.out.println("Area: " + cuadro.area());

        Circulo c = new Circulo(1, 2, 3);
        System.out.println("Area del circulo: " + c.area());

        mostrarArea(cuadro);
        mostrarArea(c);
        
                
    }
}