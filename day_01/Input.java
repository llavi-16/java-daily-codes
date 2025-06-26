//program to take input from user and print it
import java.util.*;
public class Input {
    public static void main (String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your name:");
            String s = sc.nextLine();
            System.out.println("Enter your age:");
            int i = sc.nextInt();
            System.out.println("Name: "+s);
            System.out.println("Age: "+i);
        }
    }
}
