public class Stud {
    private int rno;
    private String name;
    private final int PASSING_MARKS=33;
    
    public void result(int marks){
        if(marks>=PASSING_MARKS){
            System.out.println("Student Passed");
        }else{
            System.out.println("Student Failed");
        }
    }
    public void setPData(int rno, String name){
        this.rno=rno;
        this.name=name;
    }
    public void showPData(){
        System.out.println(rno+","+name);
    }
}
