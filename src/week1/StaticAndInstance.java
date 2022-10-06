package week1;

public class StaticAndInstance {
//    Static methods are invoked using the class name, e.g. Dog.makeNoise();
//    Instance methods are invoked using an instance name, e.g. maya.makeNoise();
//    Static methods can't access "my" instance variables, because there is no "me
    public static String a = "static value";
    public int num;

    public static void main(String[] args) {
        System.out.println(StaticAndInstance.a);
    }
}
