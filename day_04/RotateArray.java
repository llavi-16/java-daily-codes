import java.util.Arrays;
public class RotateArray{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k =3;
        System.out.println(Arrays.toString(rotate(arr, k)));

    }
    public static int[] rotate(int[] arr,int k){
        int n = arr.length;
        k=k%n;
        for(int i = 0;i<k;i++){
            int last = arr[n-1];
            for(int j =n-1;j>0;j--){
                arr[j]=arr[j-1];

            }
            arr[0]=last;
        }
        return arr;
    }
        
    
}