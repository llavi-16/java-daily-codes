
import java.util.EmptyStackException;
public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(10);
        stack.push(20);
        System.out.println("Top element is: " + stack.peek()); // Should print 20
        System.out.println("Stack size is: " + stack.size()); // Should print 2
        System.out.println("Popped element is: " + stack.pop()); // Should print 20
        System.out.println("Is stack empty? " + stack.isEmpty()); // Should print false
    }

    // Make ArrayStack a static nested class
    public static class ArrayStack{
        private final int[] stack;
        private int top;
        private final int capacity;

        public ArrayStack(int size) {
            this.capacity = size;
            this.stack = new int[capacity];
            this.top = -1; // Stack is initially empty
        }

        public void push(int value) {
            if (top == capacity - 1) {
                throw new StackOverflowError("Stack is full");
            }
            stack[++top] = value;
        }

        public int pop() {
            if (top == -1) {
                throw new EmptyStackException();
            }
            return stack[top--];
        }

        public int peek() {
            if (top == -1) {
                throw new EmptyStackException();
            }
            return stack[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public int size() {
            return top + 1;
        }
    }
}