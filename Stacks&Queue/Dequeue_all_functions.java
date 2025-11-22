import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue_all_functions {
 public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        // ---------- ADD FUNCTIONS ----------
        dq.addFirst(10);   // [10]
        dq.addLast(20);    // [10, 20]
        dq.offerFirst(5);  // [5, 10, 20]
        dq.offerLast(25);  // [5, 10, 20, 25]

        // ---------- REMOVE FUNCTIONS ----------
        dq.removeFirst();      // removes 5 → [10, 20, 25]
        dq.removeLast();       // removes 25 → [10, 20]
        dq.pollFirst();        // removes 10 → [20]
        dq.pollLast();         // removes 20 → []

        // ---------- GET / PEEK FUNCTIONS ----------
        dq.add(100);
        dq.add(200);
        dq.add(300);           // [100, 200, 300]

        int a = dq.getFirst();    // 100
        int b = dq.getLast();     // 300
        int c = dq.peekFirst();   // 100
        int d = dq.peekLast();    // 300

        // ---------- STACK FUNCTIONS ----------
        dq.push(400);  // push adds at front → [400,100,200,300]
        dq.pop();      // removes from front → removes 400

        // ---------- CHECK FUNCTIONS ----------
        boolean check1 = dq.isEmpty();   // false
        int size = dq.size();            // 3

        // ---------- ITERATION ----------
        for (int x : dq) {
            System.out.print(x + " ");   // 100 200 300
        }
    }   
}
