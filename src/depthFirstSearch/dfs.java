package depthFirstSearch;

import java.util.LinkedList;

public class dfs {
    static int V;
    LinkedList<Integer>[] adj;


    dfs(int v){
        V = v;


        //initializing the adjacency array of linked lists
        this.adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            this.adj[i] = new LinkedList<>();
        }

    }


    //Function to add edges
    void addEdge(int v, int w){
        adj[v].add(w);
    }

    // Function that performs depth first search
    public void depthFirstSearch(int v){
        boolean[] visited = new boolean[V];

        dfsUtil(v,visited);
    }

    //Utility function for dfs
    private void dfsUtil(int v,boolean[] visited) {

        visited[v] = true;
        System.out.println(v);

        for(Integer n: adj[v]){
            if(!visited[n]){
                dfsUtil(n,visited);
            }
        }
    }

    public static void main(String[] args) {
        // New object containing all the methods and functions of the graph
        dfs d = new dfs(5);

        // Adding edges
        d.addEdge(0,1);
        d.addEdge(1,2);
        d.addEdge(2,3);
        d.addEdge(3,4);
        d.addEdge(4,0);
        d.addEdge(0,2);

        // Calling dfs function
        d.depthFirstSearch(0);
    }


}
