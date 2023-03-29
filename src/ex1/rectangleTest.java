package ex1;

public class rectangleTest {
    public static void main(String[] args) {
        rectangle rec = new rectangle();
        System.out.println(rec);

        rec= new rectangle(2.0,2.0);
        System.out.println(rec);

        rec = new rectangle("blue",false,3.0,2.0);
        System.out.println(rec);
    }
}
