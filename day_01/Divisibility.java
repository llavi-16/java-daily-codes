//Write a Java program to input a number and check whether it is divisible by both 3 and 5.
import java.util.Scanner;
public class Divisibility{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int i = sc.nextInt();
            if(i%3==0&& i%5==0){
                System.out.println("yes");

            }else{
                System.out.println("No");
            }
        }
    }
}