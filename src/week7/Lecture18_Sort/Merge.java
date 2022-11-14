package week7.Lecture18_Sort;

import java.util.ArrayList;

public class Merge {
    public static <T extends Comparable> ArrayList<T> merge(ArrayList<T> arr1, ArrayList<T> arr2) {
        int index1 = 0;
        int index2 = 0;
        ArrayList<T> mergeArr = new ArrayList<>();
        while (true){
            if (arr1.get(index1).compareTo(arr2.get(index2)) < 0) {
                mergeArr.add(arr1.get(index1));
                index1++;
                if (index1 == arr1.size()) {
                    for (int i = index2; i < arr2.size(); i++) {
                        mergeArr.add(arr2.get(i));
                    }
                    break;
                }
            } else {
                mergeArr.add(arr2.get(index2));
                index2++;
                if (index2 == arr2.size()) {
                    for (int i = index1; i < arr1.size(); i++) {
                        mergeArr.add(arr1.get(i));
                    }
                    break;
                }
            }
        }

        return mergeArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i=0;i<10;i+=2){
            arr1.add(i);
            arr2.add(i+1);
        }
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(merge(arr1, arr2));
    }
}
