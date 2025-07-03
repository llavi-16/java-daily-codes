public class Figure2 {
    public double area(double radius) {
        return Math.PI * radius * radius; // Area of circle
    }

    public double area(double length, double width) {
        return length * width; // Area of rectangle
    }

    public double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height; // Area of triangle
        }
        return 0; // Default case if not a triangle
    }

    public static void main(String[] args) {
        Figure2 figure = new Figure2();
        System.out.println("Area of Circle: " + figure.area(5));
        System.out.println("Area of Rectangle: " + figure.area(4, 6));
        System.out.println("Area of Triangle: " + figure.area(3, 4, true));
    }   
    
}
