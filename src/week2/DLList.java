package week2;

import week3.List61B;
// interface inheritance

// An DLList is a list of integers, which hides the terrible truth of the nakedness within
public class DLList<LochNess> implements List61B<LochNess> {
    //    If StuffNode class never uses any detail of the DLList class (the nested class never needs to look out)
//    You can make it static
    private class StuffNode {
        //        This class cannot use anything outside like "first"
//    A nested static class cannot access any of the outer class's stuff
        public LochNess item;
        public StuffNode next;
        public StuffNode prev;

        public StuffNode(LochNess i, StuffNode n, StuffNode p){
            item = i;
            next = n;
            prev = p;
        }
    }
    //    private StuffNode first;
    private StuffNode sentinel;
    private int size;
    public DLList(){
        sentinel = new StuffNode(null, null, null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size = 0;
    }
    public DLList(LochNess x){
        sentinel = new StuffNode(null, null, null);
        sentinel.next = new StuffNode(x,sentinel,sentinel);
        sentinel.prev = sentinel.next;
        size = 1;
    }
    //    Add x to the front of the list
    public void addFirst(LochNess x){
        sentinel.next.prev = new StuffNode(x, sentinel.next, sentinel);
        sentinel.next = sentinel.next.prev;
        size += 1;
    }
    @Override
    public LochNess getFirst(){
        return sentinel.next.item;
    }

    public LochNess getLast(){
        return sentinel.prev.item;
    }
    @Override
    public void addLast(LochNess x){
//        sentinel can handle the need for handling special cases when first is none
        size += 1;
        sentinel.prev = new StuffNode(x, sentinel, sentinel.prev);
        sentinel.prev.prev.next = sentinel.prev;
    }

//    Bad way. Too slow.
//    private static int size(StuffNode p){
//        if(p.next == null){
//            return 1;
//        }
//        return 1 + size(p.next);
//    }
    @Override
    public int size(){
//        return size(first);
        return size;
    }
    @Override
    public LochNess get(int i) {
        assert i < size : "index out of range";
        StuffNode rtr = sentinel;
        int tDex = 0;
        while (tDex <= i) {
            rtr = rtr.next;
            tDex++;
        }
        return rtr.item;
    }

    @Override
    public LochNess removeLast(){
        StuffNode rtr = sentinel.prev;
        sentinel.prev = sentinel.prev.prev;
        sentinel.prev.next = sentinel;
        return rtr.item;
    }

//    print() in List61B is inefficient, overwrite it
    public void print(){
        System.out.println("Overwrite");
        StuffNode p = sentinel;
        p = p.next;
        while(p != sentinel){
            System.out.print(p.item + " ");
            p = p.next;
        }
        System.out.println();
    }

//    public int len(){
//        StuffNode p = first;
//        int len = 1;
//        while (p.next != null){
//            p = p.next;
//            len += 1;
//        }
//        return len;
//    }

    public static void main(String[] args) {
        DLList<Integer> L = new DLList<>(100);
        /*
        int:Integer
        double:Double
        char:Character
        boolean:Boolean
        long:Long
        * */
        L.addFirst(99);
        L.addFirst(98);
        L.addLast(101);
        L.addLast(102);
        L.addFirst(97);
        System.out.println(L.size());
        L.print();
        System.out.println(L.getFirst());
    }
}
