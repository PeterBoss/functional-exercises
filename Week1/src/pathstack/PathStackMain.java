package pathstack;

public class PathStackMain {

    public static void main(String[] args) {
        PathStack ps = new PathStack();
        
        System.out.println(ps.isEmpty());
        
        ps.push(10);
        ps.push(20);
        ps.push(30);
        
        System.out.println(ps.isEmpty());
                
        System.out.println(ps.pop());
        System.out.println(ps.pop());
        System.out.println(ps.pop());
        System.out.println(ps.pop());
        System.out.println(ps.pop());
        
        System.out.println(ps.isEmpty());
        
        ps.push(40);
        ps.push(50);
        
        System.out.println(ps.pop());
        System.out.println(ps.pop());
        System.out.println(ps.pop());
        System.out.println(ps.pop());
    }
    
}
