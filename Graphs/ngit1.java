import java.util.List;

/**
You are given an undirected graph representing friendships among people.
Each node represents a person, and an edge between two nodes means they are direct friends.
You are also given:
A starting person (source node)
A distance value K
Your task is to find all people who are exactly K friendship levels
away from the starting person.

Sample Testcase:1
--------------------------
input=7 6
1 2
1 3
2 4
3 5
4 6
5 7        
1
2
output=4 5
Explanation:
------------------------------
Distance from node 1:
Distance 0 → {1}
Distance 1 → {2, 3}
Distance 2 → {4, 5}
Distance 3 → {6, 7}
We need distance K = 2, so output is:4 5
 */
public class ngit1 {
    public List<Integer> friendsAtDistanceK(List<List<Integer>> graph, int start, int K) {
        
      }
}
