package week4;

import week2.SLList;

public class RotatingSLList<Item> extends SLList<Item> {
    // inherit: all instance and static variable, all methods, all nested classes
    // cannot inherit constructors
    // cannot inherit the private members
    // Rotates list to the right
    public void rotateRight(){
        Item x = removeLast();
        addFirst(x);
    }

    public static void main(String[] args) {
        RotatingSLList<Integer> rs1 = new RotatingSLList<>();
        rs1.addLast(10);
        rs1.addLast(11);
        rs1.addLast(12);
        rs1.addLast(13);

        rs1.print();

        rs1.rotateRight();
        rs1.print();
    }
}
