package week7.Lecture18_Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static week7.Lecture18_Sort.Merge.merge;

public class MergeSort {
    public static <T extends Comparable> ArrayList<T> mergeSort(ArrayList<T> arr, int begin, int end) {
        if (end - begin > 1) {
            int part1Begin = begin;
            int part1End = (begin + end) / 2;
            int part2Begin = part1End + 1;
            int part2End = end;
            return merge(mergeSort(arr, part1Begin, part1End), mergeSort(arr, part2Begin, part2End));
        } else {
            ArrayList<T> newArr = new ArrayList<>();
            if (begin == end) {
                newArr.add(arr.get(begin));
            } else {
                T first = arr.get(begin);
                T second = arr.get(end);
                if (first.compareTo(second) < 0) {
                    newArr.add(first);
                    newArr.add(second);
                } else {
                    newArr.add(second);
                    newArr.add(first);
                }
            }
            return newArr;
        }
    }
}
