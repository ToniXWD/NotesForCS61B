package week1;

public class mainFunction {
    public static void main(String[] args) {
//        java mainFunction 1 2 3 4 5
        int sum = 0;
        for(String i : args)
        {
            sum += Integer.parseInt(i);
        }
        System.out.println(sum);
    }
}
