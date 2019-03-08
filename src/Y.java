public class Y extends X {
    
    int data=200;
    
    void disp(){
        System.out.println("Welcome from disp of Y");
    }
    
    public void show(){
        super.disp();
        //System.out.println(data);
        //System.out.println(super.data);
    }
    public static void main(String args[]){
        Y ob=new Y();
        ob.show();
    }
            
}
