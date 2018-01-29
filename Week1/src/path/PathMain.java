package path;

public class PathMain {

    public static void main(String[] args) {
        LinkedPath path = new LinkedPath(10, null);
        path = new LinkedPath(9, path);
        path = new LinkedPath(8, path);
        path = new LinkedPath(7, path);
        path = new LinkedPath(6, path);
        path = new LinkedPath(5, path);
        path = new LinkedPath(4, path);
        path = new LinkedPath(3, path);
        path = new LinkedPath(2, path);
        path = new LinkedPath(1, path);
        
        System.out.println(path.getRest().getRest().getRest().getRest().getFirst());
        
    }   
    
}
