
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class _3BFS{
    public static ArrayList<Integer>bfsgragh(int v,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            Integer node = q.poll();//pulled(removed) elemennt from the queue 
            bfs.add(node);
            for(Integer it:adj.get(node)){
                if(vis[it]==false){
                    vis[it]=true;
                    q.add(it);
                }
            }
            System.out.println(q);
        }
        return bfs;
    }
    public static void main(String[] args) {
        int V = 5;//Number of vertices
        //step1:create a adjacent list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){ 
            adj.add(new ArrayList<>());
        }

        //step 2:Add edges (undirected graph)
        adj.get(0).add(1);
        adj.get(0).add(2);

        adj.get(1).add(0);
        adj.get(1).add(3);

        adj.get(2).add(0);
        adj.get(2).add(4);

        adj.get(3).add(1);
        adj.get(4).add(2);

        ArrayList<Integer> ans = bfsgragh(V, adj) ;

        System.out.println(ans);


    }
}