package edu.advanced.inheritance;

public class Circle extends Figure implements Paintable{

    private double radio;

    public Circle(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    public double showArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void paint() {

    }
}