class Figure {
    protected double dim1;
    protected double dim2;

    public Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    public double area() {
        System.out.println("Area for Figure is undefined.");
        return 0;
    }
}

class Rectangle extends Figure {
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        System.out.println("Area of Rectangle: " + r.area());

    }
}