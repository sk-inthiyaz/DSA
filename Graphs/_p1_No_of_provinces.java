import java.util.ArrayList;

public class _p1_No_of_provinces {
    private static void dfs(int node,ArrayList<ArrayList<Integer>> adjLs,int[] vis){
            vis[node]=1;
            for(Integer it:adjLs.get(node)){
                if(vis[it]==0){
                    dfs(it,adjLs,vis);
                }
            }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();
        for(int i=0;i<V;i++){
            adjLs.add(new ArrayList<Integer>());
        }   
        //change adjacent matrix to the list
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(adj.get(i).get(j)==1 && i!=j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        System.out.println(adjLs);
        int vis[] = new int[V];
        int cnt = 0;;
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                cnt++;
                dfs(i,adjLs,vis);
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int V = 3;
        int[][] edges = {
            {1,1,0},
            {1,1,0},
            {0,0,1}
        };
        System.out.println(edges.length);
        ArrayList<ArrayList<Integer>> twoDArrayList = new ArrayList<>();
        for(int[] row:edges){
            ArrayList<Integer> rowList = new ArrayList<>();
            for(int element:row){
                rowList.add(element);
            }
            twoDArrayList.add(rowList);
        }
        int ans = numProvinces(twoDArrayList, V);
    }
}
