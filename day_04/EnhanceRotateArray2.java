//import java.util.Arrays;
import java.util.*;
public class EnhanceRotateArray2 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array:");
            int n = sc.nextInt();
            int[] arr= new int[n];
            System.out.println("Enter the elements of the array:");
            for(int i =0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the number of rotations:");
            int k = sc.nextInt();
            System.out.println(Arrays.toString(reverse(arr, k)));
        }

        }
        
        
    

    public static int[] reverse(int[] arr,int k){
        int n = arr.length;
        k=k%n;
        swap(arr,0,n-1);
        swap(arr,0,k-1);
        swap(arr,k,n-1);
        return arr;
    }

    
    public static void swap(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end --;

        }
    }
}

