package edu.advanced.inheritance;

public class Square extends Figure implements Paintable {

    private double sideLength;

    public Square(double x, double y, double sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }


    public double showArea() {
        return sideLength * sideLength;
    }

    @Override
    public void paint() {
        System.out.println("Painting square");
    }

}