import java.util.*;
public class _4DFS {
    public static void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ls){
        vis[node] = true;
        ls.add(node);
        //getting neigbour nodes
        for(Integer it:adj.get(node)){
            if(vis[it]==false){
                dfs(it,vis,adj,ls);
            }
        }
    }
    public ArrayList<Integer>dfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj){
        //boolean values to keep track of visited 
        boolean vis[] = new boolean[V+1];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0,vis,adj,ls);
        return ls;
    }
}
