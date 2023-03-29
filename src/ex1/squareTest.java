package ex1;

public class squareTest {
    public static void main(String[] args) {
        square sq = new square();
        System.out.println(sq);

        sq = new square(2.3);
        System.out.println(sq);

        sq = new square("blue",true,2.0);
        System.out.println(sq);
    }
}
