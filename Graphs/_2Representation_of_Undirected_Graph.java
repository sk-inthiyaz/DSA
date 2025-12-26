
import java.util.*;

//as adjacent matrix ...
public class _2Representation_of_Undirected_Graph {
    public static ArrayList<ArrayList<Integer>> createGraph(int V,int[][] edges){
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        //Intialize the matrix with zero
        for(int i=0;i<V;i++){
            ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(V, 0));
            mat.add(row);
        }
        //Add each edge to adjacent matrix 
        for(int[] it:edges){
            int u = it[0];
            int v = it[1];
            
            mat.get(u).set(v,1);
            //since the graph is undirected graph
            mat.get(v).set(u, 1);
            System.out.println(mat.get(v).set(u, 1));
        }
        return mat;
    }
    public static void main(String[] args) {
        int V= 3;//intailizing 3 vertices 
        //List of edges 
        int[][] edges = {
            {0,1},
            {0,2},
            {1,2}
        };
        //Buiild the graph using edges 
        ArrayList<ArrayList<Integer>> mat  = createGraph(V,edges);
        
        //Adjacent matrix representation
        System.out.println("Adjacent Matrix represnetation:");
        for(int i=0;i<V;i++){
            for(int j =0;j<V;j++){
                System.out.print(mat.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
