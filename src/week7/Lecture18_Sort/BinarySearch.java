package week7.Lecture18_Sort;

import java.util.ArrayList;

public class BinarySearch {
    public static int binarySearch(String[] sorts, String x, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int m = (lo + hi) / 2;
        int cmp = x.compareTo(sorts[m]);
        if (cmp < 0) {
            return binarySearch(sorts, x, lo, m - 1);
        } else if (cmp > 0) {
            return binarySearch(sorts, x, m + 1, hi);
        } else {
            return m;
        }
    }

    public static <T extends Comparable> int binarySearch(ArrayList<T> sorts, T x, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int m = (lo + hi) / 2;
        int cmp = x.compareTo(sorts.get(m));
        if (cmp < 0) {
            return binarySearch(sorts, x, lo, m - 1);
        } else if (cmp > 0) {
            return binarySearch(sorts, x, m + 1, hi);
        } else {
            return m;
        }
    }

    public static void main(String[] args) {
//        String a = "abcde";
//        String[] A = new String[]{"ab", "abc", "abcd", "abcde"};
//        System.out.println(binarySearch(A, a, 0, A.length - 1));

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);

        System.out.println(binarySearch(arr,7,0,arr.size()-1));

    }
}
