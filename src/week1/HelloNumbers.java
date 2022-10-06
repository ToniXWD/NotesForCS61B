package week1;

public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
//        java中的type不能改变
//        Types are varified before the code even runs
        while(x < 10){
            System.out.print(x+" ");
            ++x;
        }
    }
}
