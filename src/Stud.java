public class Stud {
    private int rno;
    private String name;
    
    public void setPData(int rno, String name){
        this.rno=rno;
        this.name=name;
    }
    public void showPData(){
        System.out.println(rno+","+name);
    }
}
