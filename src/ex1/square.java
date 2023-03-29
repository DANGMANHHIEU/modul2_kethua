package ex1;

public class square extends rectangle {
    public square(){}
public square(double side){
        super(side,side);
}
public square(String color,boolean filled,double side){
        super(color,filled,side,side);
}
public double getSide(){
        return getWidth();
}
public void setSide(double side){
        setWidth(side);
        setHeight(side);
}
@Override
        public void setWidth(double width){
            setSide(width);
}
@Override
        public void setHeight(double height){
            setSide(height);
}
@Override
    public String toString(){
        return "A square with side= "+getSide()+" , which is a subclass of"+ super.toString();}

}
