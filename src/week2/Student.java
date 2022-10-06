package week2;

public class Student {

    String Name;
    int Age;

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }


    public Student(String name, int age) {
        Name = name;
        Age = age;
    }
}
