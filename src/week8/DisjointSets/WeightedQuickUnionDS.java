package week8.DisjointSets;

public class WeightedQuickUnionDS implements DisjointSets {
    private int[] parent;
    private int[] size;

    public WeightedQuickUnionDS(int N) {
        parent = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    private int find(int p) {
        while (p != parent[p]) {
            p = parent[p];
        }
        return p;
    }

    @Override
    public void connect(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (size[qRoot] < size[pRoot]) {
            parent[qRoot] = pRoot;
            size[pRoot] += size[qRoot];
        } else if (size[pRoot] < size[qRoot]) {
            parent[pRoot] = qRoot;
            size[qRoot] += size[pRoot];
        }
    }

    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }
}

