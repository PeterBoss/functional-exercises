package path;

public class LinkedPath<T> implements Path {

    private T first;
    private Path<T> rest;

    public LinkedPath(T first, Path<T> rest) {
        this.first = first;
        this.rest = rest;
    }

    public LinkedPath(Path<T> data) {
        this.first = data.getFirst();
        this.rest = data;
    }
    
    
    
    @Override
    public Object getFirst() {
        return first;
    }

    @Override
    public Path getRest() {
        return rest;
    }

}
