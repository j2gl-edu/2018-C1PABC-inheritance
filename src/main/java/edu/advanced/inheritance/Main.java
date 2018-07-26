package edu.advanced.inheritance;

public class Main {

    public static void showArea(Figure figura) {
        System.out.println("El showArea de la figura es: " + figura.showArea());
    }
    
    public static void main(String[] args) {
        // TemporalEmployee empleadoTemporal = new TemporalEmployee("Michael Jackson", 10, "111", 200.00,
        // new Date(), new Date());
        
        // //System.out.println("Nombre: " + );
        // empleadoTemporal.display();

        Square cuadro = new Square(1,2,3);
        System.out.println("Area: " + cuadro.showArea());

        Circle c = new Circle(1, 2, 3);
        System.out.println("Area del circulo: " + c.showArea());

        showArea(cuadro);
        showArea(c);
        
                
    }
}