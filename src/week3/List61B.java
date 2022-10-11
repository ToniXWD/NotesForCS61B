package week3;

public interface List61B<LochNess> {
    public void addLast(LochNess x);

    public LochNess getLast();

    public LochNess getFirst();

    public LochNess get(int i);

    public int size();

    public LochNess removeLast();

    //    default allows to write the body of the method
    default void info() {
        System.out.println("By XWD, xwdtoni@126.com");
    }

    default void print() {
        for (int i = 0; i < size(); i++) {
            System.out.println(get(i) + " ");
        }
        System.out.println();
    }
}
