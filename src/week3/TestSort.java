package week3;

import javax.lang.model.util.Elements;

public class TestSort {
    @org.junit.Test
    public void restSort(){
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);


//        for(int i=0;i<input.length;i++)
//        {
//            if(!input[i].equals(expected[i])){
//                System.out.println("Mismatch in position "+i+", expected: "+expected[i]+", but got: "+input[i]);
//                return;
//            }
//        }
//        replace the codes above with junit
        org.junit.Assert.assertArrayEquals(expected, input);



        if(!java.util.Arrays.equals(input, expected)){
            System.out.println("Error");
        }
    }
//    public static void main(String[] args) {
//        restSort();
//    }
}
