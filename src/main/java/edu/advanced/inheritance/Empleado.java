package edu.advanced.inheritance;

public class Empleado extends Object {
    protected String nombre;
    protected int edad;
    protected String dpi;
    protected double salario;

    public Empleado() {
        super();
        System.out.print("Test");
    }

    public Empleado(String nombre, int edad, String dpi, double salario) {
        System.out.println("Contructor de empleado");
        this.nombre = nombre;
        this.edad = edad;
        this.dpi = dpi;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Override de toString en Empelado";
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
    }

}