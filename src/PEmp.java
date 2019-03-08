public class PEmp extends Emp {
    private String desg;
    private int sal;
                    
    public PEmp(int eno, String ename, String desg, int sal){
        super(eno,ename);
        this.desg=desg;
        this.sal=sal;
    }
    public void info(){
        super.info();
        System.out.println(desg+","+sal);
    }
                
    
    public static void main(String args[]){
        PEmp e=new PEmp(111,"ABC","Manager",50000);
        e.info();
    }
}
