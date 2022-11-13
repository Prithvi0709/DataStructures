package unionFind.MSTPractice;

import org.jetbrains.annotations.NotNull;

public class minimumSpanningTree {

    public static class subsets
    {
        int parent;
        int rank;
    }

    int V,E;
    Edge[] edge;

    public static class Edge implements Comparable<Edge>
    {
        int src, des, weight;
        @Override
        public int compareTo(@NotNull minimumSpanningTree.Edge o)
        {
            return this.weight - o.weight;
        }
    }

}
