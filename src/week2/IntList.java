package week2;

// A naked recursive data structure
public class IntList {
    public IntList(int a) {
        this.first = a;
        this.rest = null;
    }

    public IntList(int a, IntList r) {
        this.first = a;
        this.rest = r;
    }

    public IntList() {
        this.first = 0;
        this.rest = null;
    }

    public void printList(){
        IntList p = this;
        while(p.rest !=null){
            System.out.print(p.first + " ");
            p = p.rest;
        }
        System.out.println(p.first);
    }

//    return the size of the list using ... recursion
    public int size(){
        if(this.rest == null) return 1;
        return 1 + this.rest.size();
    }

//    return the size of the list using iteration
    public int len(){
        IntList p = this;
        int len = 1;
        while(p.rest != null){
            len +=1;
            p = p.rest;
        }
        return len;
    }

    public int get(int i){
        if(i==0) return first;
        IntList p = this;
        for(int j = 0;j<i;j++){
            p = p.rest;
        }
        return p.first;
    }

    public int first;
    public IntList rest;

    public static void main(String[] args) {
        IntList L = new IntList(5);
        L.rest = new IntList(6);
        L.rest.rest = new IntList(7);

        L.printList();

        System.out.println(L.size());
        System.out.println(L.len());

        System.out.println(L.get(2));
    }
}
