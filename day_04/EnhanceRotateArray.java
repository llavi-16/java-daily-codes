import java.util.Arrays;
public class EnhanceRotateArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        System.out.println(Arrays.toString(reverse(arr, k)));
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
