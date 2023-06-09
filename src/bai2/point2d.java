package bai2;

import java.util.Arrays;

public class point2d {
    private float x = 0.0f;
    private float y = 0.0f;
    public point2d(){}
    public point2d(float x, float y){
        this.x =x;
        this.y=y;
    }
    public float getX(){
        return this.x;
    }
    public void setX(float x){
        this.x=x;
    }
    public float getY(){
        return this.y;
    }
    public void setY(float y){
        this.y =y;
    }
    public void setXY(float x,float y){
        this.x =x;
        this.y =y;
    }
    public float[] getXY(){
        float[] arr = new float[2];
            arr[0]= getX();
            arr[1]=getY();
        return arr;
    }
    @Override
    public String toString(){
        return "point2d {"+" x= "+getX() +"y= "+getY() + " xy = "+ Arrays.toString(getXY());
    }
}
