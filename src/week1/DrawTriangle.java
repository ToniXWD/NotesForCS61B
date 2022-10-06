package week1;

public class DrawTriangle {
    public static void printStar(int N) {
        for(int i=1;i<=N;i++){
            for (int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printStar(10);
    }
}
