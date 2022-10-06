package week2;

public class Array {
    public static void main(String[] args) {
        int[] y = new int[3];
        int[] x = new int[]{1,3,7,9};
        int[] z = {11,22,33,44,55,66,77};
        System.arraycopy(x,0,z,1,3);
//        把x从下标零开始以后的3个元素复制到z，z复制的位置从1开始
        for (int j : z) {
            System.out.print(j + " ");
        }
        System.out.println();

//        2D Array
        int [][] pascalTriangle;
        pascalTriangle = new int[4][];
        int[] rowZero = pascalTriangle[0];

        pascalTriangle[0] = new int[]{1};
        pascalTriangle[1] = new int[]{1, 1};
        pascalTriangle[2] = new int[]{1, 2, 1};
        pascalTriangle[3] = new int[]{1, 3, 3, 1};
        int[] rowTwo = pascalTriangle[2];

        rowTwo[1] = -5;

        int[][] matrix;
        matrix = new int[4][];
        matrix = new int[4][4];

        int[][] pascalAgain = new int[][] {{1},{1,1},{1,2,1},{1,3,3,1}};
    }
}
