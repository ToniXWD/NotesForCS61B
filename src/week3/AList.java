package week3;
// interface inheritance
public class AList<LochNess> implements List61B<LochNess> {
    private LochNess[] LochNesses;
    private int size;

    public AList() {
        this.LochNesses = (LochNess[]) new Object[100];
        this.size = 0;
    }

    private void resize(int capacity){
//        LochNesses[] a = new LochNesses[capacity]; # error
        LochNess[] a = (LochNess[]) new Object[100];
        System.arraycopy(LochNesses,0,a,0,size);
        LochNesses = a;
    }
    @Override
    public void addLast(LochNess x){
    if (size == LochNesses.length){
        resize(size*2);
    }
        LochNesses[size++] = x;
    }

    @Override
    public LochNess getLast(){
        return LochNesses[size-1];
    }
    public LochNess getFirst(){
        return LochNesses[0];
    }
    @Override
    public LochNess get(int i){
        return LochNesses[i];
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public LochNess removeLast(){
        LochNess x = LochNesses[size-1];
        LochNesses[size-1] = null;
        --size;
        return x;
    }
}
