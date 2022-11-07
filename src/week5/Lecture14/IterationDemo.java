package week5.Lecture14;

import week5.Lecture13.ArrayMap;

public class IterationDemo {
    public static void main(String[] args) {
        ArrayMap<String, Integer> am = new ArrayMap<String, Integer>();

        am.put("hello", 5);
        am.put("syrups", 10);
        am.put("kingdom", 10);

        ArrayMap.KeyIterator ami = am.new KeyIterator();

        while (ami.hasNext()){
            System.out.println(ami.next());
        }

        System.out.println("Using  for (String s : am) ");

        for (String s : am){
            System.out.println(s);
        }
    }
}
