package bai1;

public class test {
    public static void main(String[] args) {
        circle cha = new circle();
        System.out.println(cha);
        cha = new circle(3.0,"blue");
        System.out.println(cha);


        clinder con =new clinder();
        System.out.println(con);
        con = new clinder(3.0,"blue",3.0);
        System.out.println(con);
    }
}
