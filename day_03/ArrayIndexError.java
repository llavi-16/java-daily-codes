public class ArrayIndexError {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        try{
            System.out.println(arr[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errorrrr: "+e.getMessage());
        }
    }
    
}
