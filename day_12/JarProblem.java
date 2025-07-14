import java.util.*;
public class JarProblem{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of jars:");
            int n = sc.nextInt();
            int[] jars = new int[n];
            System.out.println("Enter the number of candies in each jar:");
            for (int i = 0; i < n; i++) {
                jars[i] = sc.nextInt();
            }

            System.out.println("Enter the number of operations:");
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                System.out.println("Enter operation (1 for add, 2 for remove):");
                int op = sc.nextInt();
                System.out.println("Enter jar index and number of candies:");
                int index = sc.nextInt() - 1; // Convert to 0-based index
                int candies = sc.nextInt();

                if (op == 1) {
                    jars[index] += candies;
                } else if (op == 2) {
                    jars[index] -= candies;
                    if (jars[index] < 0) {
                        jars[index] = 0; // Prevent negative candies
                    }
                }
                
            }

            System.out.println("Final state of jars:");
            for (int jar : jars) {
                System.out.print(jar + " ");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}