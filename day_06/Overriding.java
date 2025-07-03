public class Overriding {

    public static void main(String[] args) {
        Overriding mammal = new Dog();
        mammal.eat();
    }
    void eat() {
        System.out.println("Mammal is eating");
    }
    static class Dog extends Overriding {
        @Override
        void eat() {
            System.out.println("Dog is eating");
        }
    }
}