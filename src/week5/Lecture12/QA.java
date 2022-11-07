package week5.Lecture12;

public class QA {
    public QA(){}
    public class Dog {
        int size;
        static String scientificName = "canis familiaris";
    }

    public class Poodle extends Dog {
        Poodle() {
            this.scientificName = "Poodle familiaris";
        }
    }

    public class Outer {
        public int outvar;
        public void setInner(){
            Inner i1 = new Inner();
            i1.invar = 10;
            System.out.println(i1.invar);
        }
        private class Inner {
            public int invar;
            Outer temp = new Outer();
//            temp.outvar = 20; // an Inner cannot access an Outer’s outvar
        }
    }

    public class Cat {
        public void f() {
//            this = new Cat(); // not allowed
        }
    }


    public void test() {
//        1
        String a = "horse";
        String b = "horse";
        System.out.println(a==b);
        System.out.println(a.equals(b));

//        2
        Poodle.scientificName = "changed from Poodle"; // scientificName in Dog changes as well, they are the same
        System.out.println("scientificName in Dog is: "+Dog.scientificName);
        System.out.println("scientificName in Poodle is: "+Poodle.scientificName);
        Poodle p1 = new Poodle(); // static variable in super class shares itself with its subclass
        System.out.println("scientificName in Dog is: "+Dog.scientificName);
        System.out.println("scientificName in Poodle is: "+Poodle.scientificName);

//        3
        Outer o1 = new Outer();
        o1.outvar = 1;
        o1.setInner(); // An Outer CAN access an Inner’s variables.
        // Classes other than Outer cannot make or access Inners anymore.

        Cat d = new Cat();
        d.f();
    }
}
