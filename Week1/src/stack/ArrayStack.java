package stack;

public class ArrayStack<T> {

    private T[] data = null;
    private int top = 0;

    public ArrayStack(int size) {
        data = (T[]) new Object[size];
    }
    
    public void push(T element) {
        data[++top] = element;
    }
    
    public T pop() {
        return (top == 0) ? null : data[top--];
    }
    
    public boolean isEmpty() {
        return (top == 0);
    }

}
