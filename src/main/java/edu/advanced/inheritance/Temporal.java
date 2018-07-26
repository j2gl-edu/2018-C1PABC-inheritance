package edu.advanced.inheritance;

import java.util.Date;

public class Temporal extends Empleado {
    Date fechaIngreso;
    Date fechaSalida;

    public Temporal(String nombre, int e, String d, double s, Date fechaIngreso, Date sal) {
        super(nombre, e, d, s);
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = sal;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Nomrbe: " + nombre);
        System.out.println("FechaIngreso: " + fechaIngreso.toString());
    }

    
}