package week3;

import week2.DLList;
import week2.SLList;

public class HandleDifferentList {
    public static String longest(List61B<String> list){
        int maxDex = 0;
        for(int i=0;i<list.size();i++){
            String longestString = list.get(maxDex);
            String thisString = list.get(i);
            if(thisString.length() > longestString.length()){
                maxDex = i;
            }
        }
        return list.get(maxDex);
    }

    public static void main(String[] args) {
        List61B<String> someList = new DLList<>();
        someList.addLast("elk");
        someList.addLast("are");
        someList.addLast("watching");
        System.out.println(longest(someList));
        someList.print();
    }
}
