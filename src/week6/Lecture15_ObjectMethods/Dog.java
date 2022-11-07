package week6.Lecture15_ObjectMethods;

public class Dog {
    int age;
    String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Dog() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Dog's name: " + name + "Dog's age: " + age;
    }

    public static void main(String[] args) {
        Dog d = new Dog(5, "tommy");
        System.out.println(d);
    }
}
