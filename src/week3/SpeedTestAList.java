package week3;

public class SpeedTestAList {
    public static void main(String[] args) {
        AList<Integer> L = new AList<>();
        int i = 0;
        while(i<100000){
            L.addLast(i);
            i++;
        }
    }
}
