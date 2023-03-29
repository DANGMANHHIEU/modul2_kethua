package ex1;

public class shape {
    private String color = "red";
    private boolean filled = true;
    public shape(){}
    public shape(String color,boolean filled){
        this.color = color;
        this.filled =filled;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String c){
        this.color = c;
    }
    public boolean getFilled(){
        return this.filled;
    }
    public void setFilled(boolean f){
        this.filled=f;
    }
    @Override
    public String toString(){
         return "A shape with color of "+ getColor()+ " and "+(getFilled()? "filled":"not filled");
    }
}
