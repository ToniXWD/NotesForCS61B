package week6.Lecture16;

import java.util.LinkedList;

public class ExtensionStack <Item> extends LinkedList<Item> {
    public void push(Item x) {
        add(x);
    }
}
