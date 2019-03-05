public class B extends A {

    public void show(){
        System.out.println("Hello From Show Of B");
    }
    public void disp(final int p){
        System.out.println(p);
        
        System.out.println(p);
    }
    
public static void main(String args[]){
    B ob=new B();
    ob.show();
    ob.disp(100);
    
    
}    
}
