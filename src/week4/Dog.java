package week4;
import java.util.Comparator;

//public class Dog implements OurComparable {
public class Dog implements Comparable<Dog> {
    private String name;
    private int age;
    private int weight;

    public Dog() {
    }
    public Dog(String type, int age, int weight) {
        this.name = type;
        this.age = age;
        this.weight = weight;
    }

    public void bark(){
        System.out.println(this.name+" bark");
    }

    @Override
    public int compareTo(Dog uddadog){
        /** Return minus integer if this < o
         * Return 0 if this == o
         * Return positive integer if this > o
         */
//        Dog uddaDog = (Dog) o;
//        return Integer.compare(this.weight, ((Dog) o).weight);
//        return this.weight - ((Dog) o).weight;
        return this.weight - uddadog.weight;
    }

    private static class NameComparator implements Comparator<Dog>{
         public int compare(Dog a, Dog b){
             return a.name.compareTo(b.name);
         }
    }

    public static Comparator<Dog> getNameComparator(){
        return new NameComparator();
    }
}
