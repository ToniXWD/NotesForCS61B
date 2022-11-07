package week6.Lecture16;

import java.util.LinkedList;

public class DelegationStack <Item> {
    private LinkedList<Item> L = new LinkedList<Item>();
    public void push(Item x) {
        L.add(x);
    }
}
