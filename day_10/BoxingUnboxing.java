   public class BoxingUnboxing{
    public static void main(String[] args){
        int a =50;
        Integer obj = a; // Boxing: converting primitive to object
        int b = obj; // Unboxing: converting object to primitive
        System.out.println("object: "+obj);
        System.out.println("primitive: "+b);
    }
}