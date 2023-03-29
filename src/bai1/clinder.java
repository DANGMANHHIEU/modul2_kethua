package bai1;

public class clinder extends circle{
    private double height =1.0;
    public clinder(){}
    public clinder(double r,String c, double height){
        super(r,c);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height=height;
    }

    public double volume(){
        return getArea()*height;
    }
    @Override
    public String toString(){
        return "height: "+ getHeight()+ super.toString()+ " volume: "+ volume();
    }
}
