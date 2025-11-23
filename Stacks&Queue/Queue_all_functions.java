import java.util.LinkedList;
import java.util.Queue;

public class Queue_all_functions {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // ---------- ADD FUNCTIONS ----------
        q.add(10);      // [10]
        q.add(20);      // [10, 20]
        q.offer(30);    // [10, 20, 30]   (safe add)

        // ---------- REMOVE FUNCTIONS ----------
        q.remove();     // removes 10 → [20, 30]
        q.poll();       // removes 20 → [30]
        // poll() returns null if queue empty

        // ---------- PEEK / GET FUNCTIONS ----------
        q.add(40);
        q.add(50);       // [30, 40, 50]

        int a = q.element();  // 30 (error if empty)
        int b = q.peek();     // 30 (null if empty)

        // ---------- CHECK FUNCTIONS ----------
        boolean check1 = q.isEmpty();  // false
        int size = q.size();           // 3
        boolean check2 = q.contains(40); // true

        // ---------- ITERATION ----------
        for (int x : q) {
            System.out.print(x + " ");   // 30 40 50
        }
    }   
}
