public class College {

public static void main(String args[]){
    EngStud s1=new EngStud();
    s1.setPData(111, "AAA");
    s1.setEData("CS", 3);
    s1.showPData();
    s1.showEData();
    s1.result(40);
    System.out.println("______________________________");
    MediStud s2=new MediStud();
    s2.setPData(112, "BBB");
    s2.setMData(2);
    s2.showPData();
    s2.showMData();
    s2.result(40);
    
    String result=s2.toString();
    System.out.println(result);
    
}    
}
