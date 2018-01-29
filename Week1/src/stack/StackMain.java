package stack;

public class StackMain {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(1000);

        
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        
    }
    
}
