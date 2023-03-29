package bai1;

public class circle {
    private double radius =1.0;
    private String color = "red";
    public circle(){}
    public circle(double r, String c ){
        this.radius =r;
        this.color = c;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public String toString (){
        return "radius: "+getRadius()+" color: "+getColor()+" area: "+getArea();
    }

}
