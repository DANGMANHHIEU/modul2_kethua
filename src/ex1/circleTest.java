package ex1;

public class circleTest {
    public static void main(String[] args) {
        Circle c =new Circle();
        System.out.println(c);

        c = new Circle(3.5);
        System.out.println(c);

        c= new Circle("blue",false,5.0);
        System.out.println(c);
    }
}
