import java.util.ArrayList;

public class _1store {
    public static void main(String[] args) {
        int n=3,m=3;
        // Create n+1 nodes to support 1-indexed vertices (indices 0 to n, where 0 is unused)
        ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++){  // Loop from 0 to n to create n+1 empty lists
            adj.add(new ArrayList<Integer>());  // Add an empty ArrayList for each node (this initializes the adjacency list)
        }
        //edge 1--2
        adj.get(1).add(2);
        adj.get(2).add(1);

        //edge 2--3
        adj.get(2).add(3);
        adj.get(3).add(2);

        //edge 1--3
        adj.get(1).add(3);
        adj.get(3).add(1);

        //0-->3
        //2nd for ->No becase empty list 
        //1-->3    ([2,3])
        //2nd for ->yes -> 2 3
        //2-->3     ([1,3])  
        //2nd for ->yes -> 1 3  
        //3-->3 [2,1]
        //3rd for ->yes ->2 1
        for(int i=1;i<=n;i++){  // Changed to start from 1
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+"  ");
            }
            System.out.println();
        }
    }
}
