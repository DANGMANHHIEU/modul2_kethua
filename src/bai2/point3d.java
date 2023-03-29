package bai2;

import java.util.Arrays;

public class point3d extends point2d {
    private float z =0.0f;
    public point3d(){}
    public point3d(float x,float y,float z){
        super(x, y);
        this.z =z;
    }
    public float getZ(){
        return this.z;
    }
    public void setZ(float z){
        this.z=z;
    }
    public void setXYZ(float x ,float y, float z){
        setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ(){
        float arr[]= new float[3];
           arr[0]=getX();
           arr[1]=getY();
        arr[2]=getZ();
        return arr;
    }
    @Override
    public String toString (){
        return "point 3d { x= "+getX()+" y= "+getY()+" z= "+getZ()+" xyz "+ Arrays.toString(getXYZ());
    }

}
