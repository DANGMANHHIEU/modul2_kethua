package ex1;

public class Circle extends shape{
    private double radius =1.0;
    public Circle(){}
    public Circle(double r){
        this.radius = r;
    }
    public Circle(String color,boolean filled, double radius){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    @Override
    public String toString (){
        return " A Circle with radius: "+ getRadius() + " , which is a subclass "+super.toString();
    }
}
