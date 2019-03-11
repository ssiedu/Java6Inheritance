public abstract class Shape {
    
    protected double radius;
    
    public final void setRadius(double radius){
        this.radius=radius;
    }
    public abstract void calculateArea();
    
}
