package week7.Lecture18_Sort;

import java.util.ArrayList;

import static week7.Lecture18_Sort.BinarySearch.binarySearch;
import static week7.Lecture18_Sort.MergeSort.mergeSort;
import static week7.Lecture18_Sort.SelectionSort.selectionSort;

public class TestSort {
    public static void main(String[] args) {
        String s = "ehjfefergrehrtjhrtjhtykmfewuniofchnweohdfioqwendxyb9uiqwebrfcyn9wenrvu9weomrtvnu4owermtvun40ermtvbhjioov";
        char[] arrS = s.toCharArray();
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            for (char temp : arrS) {
                arr.add(temp);
            }
        }
//        System.out.println("Origin arr:\n" + arr);
        long mergeBeginTime = System.currentTimeMillis();
        ArrayList<Character> sortedArr = mergeSort(arr, 0, arr.size() - 1);
        long mergeEndTime = System.currentTimeMillis();
        System.out.println("MegeSort takes " + (mergeEndTime - mergeBeginTime) + " ms");
//        System.out.println(sortedArr);

        System.out.println();

//        System.out.println("Origin arr:\n" + arr);
        long SelectionSortBeginTime = System.currentTimeMillis();
        selectionSort(arr, 0, arr.size() - 1);
        long SelectionSortTime = System.currentTimeMillis();
        System.out.println("SelectionSort takes " + (SelectionSortTime - SelectionSortBeginTime) + " ms");
//        System.out.println(binarySearch(arr, 0, arr.size() - 1));
    }
}
