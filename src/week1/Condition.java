package week1;

public class Condition {
    public static void main(String[] args) {
        int x = 5;

        if (x < 0)
            System.out.println("I should negate X");
//        如果不加{},，if语句为真时，只执行System.out.println("I should negate X");
            x = -x;

        System.out.println(x);
    }
}
