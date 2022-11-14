package week8.DisjointSets;

public class QuickUnionDS implements DisjointSets {
    private int[] parent;

    public QuickUnionDS(int N) {
        parent = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = i;
        }
    }

    private int find(int p) {
        while(p!=parent[p]){
            p = parent[p];
        }
        return p;
    }
    @Override
    public void connect(int p, int q) {
        parent[find(p)] = find(q);
    }

    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }
}
