public class MediStud extends Stud {
    private int profs;
    
    public void result(int marks){
        if(marks>=50){
            System.out.println("MediStud Passed");
        }else{
            System.out.println("MediStud Failed");
        }
    }
    public void setMData(int profs){
        this.profs=profs;
    }
    public void showMData(){
        System.out.println(profs);
    }
}
