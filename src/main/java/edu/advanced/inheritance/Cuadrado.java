package edu.advanced.inheritance;

public class Cuadrado extends Figura implements Dibujable {

    private double lado;

    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Cuadrado....");
    }

}