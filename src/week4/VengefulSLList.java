package week4;

import week2.SLList;

public class VengefulSLList<Item> extends SLList<Item> {
    SLList<Item> deletedItem;
    public VengefulSLList(){
        deletedItem = new SLList<Item>();
    }

    public VengefulSLList(Item x){
        super(x);
        deletedItem = new SLList<Item>();
    }

    @Override
    public Item removeLast(){
        Item x = super.removeLast();
        deletedItem.addLast(x);
        return x;
    }

    public void printLostItems(){
        deletedItem.print();
    }
    public static void main(String[] args) {
        VengefulSLList<Integer> vs1 = new VengefulSLList<>();
        vs1.addLast(1);
        vs1.addLast(5);
        vs1.addLast(10);
        vs1.addLast(13);

        vs1.removeLast();
        vs1.removeLast();

        System.out.print("The fallen are: ");
        vs1.printLostItems();
    }
}
