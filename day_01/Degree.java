//Convert Celsius to Fahrenheit and vice versa using a menu.
import java.util.Scanner;
public class Degree {
  public static void main(String[] args) {
      try(Scanner input = new Scanner(System.in)){
        System.out.println("Choose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Enter temperature in Celsius:");
                double celsius = input.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
              }

            case 2 -> {
                System.out.println("Enter temperature in Fahrenheit:");
                double fahrenheitInput = input.nextDouble();
                double celsiusOutput = (fahrenheitInput - 32) * 5/9;
                System.out.println(fahrenheitInput + " Fahrenheit is " + celsiusOutput + " Celsius.");
              }
            default -> System.out.println("Invalid choice. Please select 1 or 2.");
            }
  }  
}
}

