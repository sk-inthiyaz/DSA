import java.util.Scanner;

class BasicBinaryTree {
    public BasicBinaryTree() {
    }
    
    private static class Node {
        int value;
        Node left;
        Node right;
        
        public Node(int value) {
            this.value = value;
        }
    }
    
    private Node root;
    
    // Insert elements
    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node:");
        int value = scanner.nextInt();
        root = new Node(value);
        insert(scanner, root);
    }
    
    private void insert(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value + "? (true/false)");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of left of " + node.value);   
            int value = scanner.nextInt();
            node.left = new Node(value);
            insert(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value + "? (true/false)");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right of " + node.value);   
            int value = scanner.nextInt();
            node.right = new Node(value);
            insert(scanner, node.right);
        }
    }
    
    // Display the tree in a structured manner
    public void display() {
        if (root == null) {
            System.out.println("Tree is empty!");
            return;
        }
        display(root, 0, "Root: ");
    }
    
    private void display(Node node, int level, String prefix) {
        if (node == null) {
            return;
        }
        
        // Print current node with indentation
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(prefix + node.value);
        
        // Recursively display left and right children
        if (node.left != null || node.right != null) {
            if (node.left != null) {
                display(node.left, level + 1, "L--- ");
            } else {
                // Print empty left child for better visualization
                for (int i = 0; i < level + 1; i++) {
                    System.out.print("    ");
                }
                System.out.println("L--- null");
            }
            
            if (node.right != null) {
                display(node.right, level + 1, "R--- ");
            } else {
                // Print empty right child for better visualization
                for (int i = 0; i < level + 1; i++) {
                    System.out.print("    ");
                }
                System.out.println("R--- null");
            }
        }
    }
    
    // Alternative display method with better visual representation
    public void displayTree() {
        System.out.println("\n=== Tree Structure ===");
        displayTree(root, 0);
        System.out.println("======================");
    }
    
    private void displayTree(Node node, int level) {
        if (node == null) {
            return;
        }
        
        // Process right child first (for better visualization)
        displayTree(node.right, level + 1);
        
        // Print current node
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(node.value);
        
        // Process left child
        displayTree(node.left, level + 1);
    }
    
    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BasicBinaryTree tree = new BasicBinaryTree();
        
        tree.populate(scanner);
        
        System.out.println("\n=== Hierarchical Tree View ===");
        tree.display();
        
        System.out.println("\n=== Rotated Tree View (90° clockwise) ===");
        tree.displayTree();
        
        scanner.close();
    }
}



// import java.util.Scanner;

// class basicBinaryTree{
//     public basicBinaryTree(){

//     }
//     private static class Node {
//             int value;
//             Node left;
//             Node right;
//             public Node(int value) {
//                 this.value = value;
//             }
//         }
//     private Node root;
//     //insert elements
//     public void populate(Scanner scanner){
//         System.out.println("Enter the root Node:");
//         int value = scanner.nextInt();
//         root = new Node(value);
//     }
//     private void insert(Scanner scanner,Node node){
//         System.out.println("Do You want to enter left of "+node.value);
//         boolean left = scanner.nextBoolean();
//         if(left){
//             System.out.println("Enter the value of left of "+node.value);   
//             int value = scanner.nextInt();
//             node.left = new Node(value);
//             insert(scanner,node.left);
//         }

//         System.out.println("Do You want to enter right of "+node.value);
//         boolean right = scanner.nextBoolean();
//         if(right){
//             System.out.println("Enter the value of right of "+node.value);   
//             int value = scanner.nextInt();
//             node.right = new Node(value);
//             insert(scanner,node.right);
//         }
        
//     }
// }