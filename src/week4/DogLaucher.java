package week4;

import java.util.Comparator;

public class DogLaucher {
    public static void main(String[] args) {
        Dog d1 = new Dog("aaa",3,10);
        Dog d2 = new Dog("bbb",3,15);
        Dog d3 = new Dog("ccc",4,20);
        Dog[] dogs = new Dog[]{d1,d2,d3};
        Dog d = (Dog) Maximizer.max(dogs);
        d.bark();

//        Dog.NameComparator nc = new Dog.NameComparator();
        Comparator<Dog> nc = Dog.getNameComparator();
        if(nc.compare(d1,d3)>0){
            d1.bark();
        } else {
            d3.bark();
        }
    }
}
