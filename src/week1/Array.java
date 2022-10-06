package week1;

public class Array {
    public static int Max(int[] array){
        int max = 0;
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    public static int Min(int[] array){
        int max = 0;
        for (int j : array) {
            if (max > j) {
                max = j;
            }
        }
        return max;
    }

    public static int[] windowPosSum(int[] a, int n){
        int[] b = (int[]) a.clone();
        for(int i=0; i<a.length-1;i++){
            int maxid = Math.min(i + n, a.length-1);
            for(int j=i+1;j<=maxid;j++){
                b[i] += a[j];
            }
        }
        return b;
    }

    public static void main(String[] args) {
//        define method 1
        int[] numbers = new int[3];
        numbers[0] = 4;
        numbers[1] = 7;
        numbers[2] = 9;

//        define method 2
        int[] numbers2 = new int[]{3,6,9,7,1,0,-1};

        System.out.println(numbers.length);
        System.out.println(Max(numbers));

        for (int j : numbers2) {
            System.out.print(j);
            System.out.print(" ");
        }
        System.out.println();

        int[] numbers3 = windowPosSum(numbers2,3);

        for (int j : numbers2) {
            System.out.print(j);
            System.out.print(" ");
        }
        System.out.println();

        for (int j : numbers3) {
            System.out.print(j);
            System.out.print(" ");
        }
        System.out.println();
    }
}
