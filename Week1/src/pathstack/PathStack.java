package pathstack;

import path.LinkedPath;

public class PathStack<T> {

    private LinkedPath<T> data = null;

    public void push(T element) {
        data = new LinkedPath(element, data);
    }

    public T pop() {
        if (data == null) {
            return null;
        }

        T result = (T) data.getFirst();

        data = (LinkedPath<T>) data.getRest();

        return result;

    }

    public boolean isEmpty() {
        return (data == null);
    }

}
