package week2;

import week3.List61B;
// interface inheritance

// An SLList is a list of integers, which hides the terrible truth of the nakedness within
public class SLList<LochNess> implements List61B<LochNess> {
//    If StuffNode class never uses any detail of the SLList class (the nested class never needs to look out)
//    You can make it static
    private class StuffNode {
//        This class cannot use anything outside like "first"
//    A nested static class cannot access any of the outer class's stuff
        public LochNess item;
        public StuffNode next;

        public StuffNode(LochNess i, StuffNode n){
            item = i;
            next = n;
        }
    }
//    private StuffNode first;
    private StuffNode sentinel;
    private int size;
    public SLList(){
        sentinel = new StuffNode(null, null);
        size = 0;
    }
    public SLList(LochNess x){
        sentinel = new StuffNode(null, null);
        sentinel.next = new StuffNode(x,null);
        size = 1;
    }

//    Add x to the front of the list
    public void addFirst(LochNess x){
        sentinel.next = new StuffNode(x, sentinel.next);
        size += 1;
    }
    @Override
    public LochNess getFirst(){
        return sentinel.next.item;
    }
    @Override
    public LochNess get(int i){
        assert i < size: "index out of range";
        StuffNode rtr = sentinel;
        int tDex = 0;
        while(tDex<=i){
            rtr = rtr.next;
            tDex++;
        }
        return rtr.item;
    }
    @Override
    public void addLast(LochNess x){
//        sentinel can handle the need for handling special cases when first is none
        size += 1;
        StuffNode p = sentinel;
        while (p.next != null) p = p.next;
        p.next = new StuffNode(x,null);
    }

//    Bad way. Too slow.
//    private static int size(StuffNode p){
//        if(p.next == null){
//            return 1;
//        }
//        return 1 + size(p.next);
//    }
    @Override
    public LochNess getLast(){
        StuffNode p = sentinel;
        while (p.next != null){
            p = p.next;
        }
        return p.item;
    }
    @Override
    public LochNess removeLast(){
        StuffNode p = sentinel;
        StuffNode q = sentinel;
        while (p.next != null){
            q = p;
            p = p.next;
        }
        q.next = null;
        return p.item;
    }
    @Override
    public int size(){
//        return size(first);
        return size;
    }

//    print() in List61B is inefficient, overwrite it
    public void print(){
//        System.out.println("Overwrite");
        StuffNode p = sentinel;
        while(p.next != null){
            p = p.next;
            System.out.print(p.item + " ");
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
        SLList<String> L = new SLList<>();
        /*
        int:Integer
        double:Double
        char:Character
        boolean:Boolean
        long:Long
        * */
        L.addFirst("xwd");
        L.addFirst("toni");
        L.addLast("v");
        System.out.println(L.size());
        L.print();
        System.out.println(L.get(2));
        System.out.println(L.getFirst());
//        interface's default method
        L.info();
    }
}
