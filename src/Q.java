
public class Q extends P {

    public Q() {
        super(10);
        System.out.println("Q-0");
    }

    public Q(int a) {
        super(1,2);
        System.out.println("Q-1");
    }

    public Q(int a, int b) {
        this(1,2,3);
        System.out.println("Q-2");
    }
    public Q(int a, int b, int c) {
        System.out.println("Q-3");
    }
    public static void main(String args[]){
        
        Q ob=new Q(10,20);
        
        
    }
    
}
