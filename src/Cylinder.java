public class Cylinder extends Shape {
    private double height;
    public void setHeight(double height){
        this.height=height;
    }
    public void calculateArea(){
        double area=2*3.14*radius*height;
        System.out.println("Area of Cylinder : "+area);
    }
}
