package week7.Lecture18_Sort;

import java.util.ArrayList;

public class SelectionSort {
    public static <T extends Comparable> void selectionSort(ArrayList<T> arr, int begin, int end) {
        for (int i = begin; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                T pre = arr.get(i);
                T aft = arr.get(j);
                if (pre.compareTo(aft) > 0) {
                    arr.set(i, aft);
                    arr.set(j, pre);
                }
            }
        }
    }
}
