package week5.Lecture14;

import week5.Lecture13.ArrayMap;

public class ExceptionDemo {
    public static void main(String[] args) {
        ArrayMap<String, Integer> map1 = new ArrayMap<>();
        map1.put("xwd",100);
        System.out.println(map1.get("xwd"));
        try {
            System.out.println(map1.get("toni"));
        } catch (Exception e){
            System.out.println("Try to get the value of key 'toni', but get: " + e);
        }
        System.out.println("get toni fails");
    }
}
