package ex1;

public class rectangle extends shape{
    private double width =1.0;
    private double height = 1.0;
    public rectangle(){}
    public rectangle(double w, double h){
        this.width = w;
        this.height = h;
    }
    public rectangle(String color,boolean filled,double w,double h){
        super(color,filled);
        this.width =w;
        this.height = h;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return  this.height;
    }
    public void setWidth(double width){
        this.width =width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getArea(){
        return width* height;
    }
    public double getPerimeter(){
        return (width+ height)*2;
    }
     @Override
    public String toString(){
        return "A rectangle with width "+getWidth()+"and height "+getHeight()+" , which is a subclass"+ super.toString();
     }

}
