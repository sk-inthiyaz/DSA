public class _3NewLL {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int val){
            this.data = val;
        }
        ListNode(int val,ListNode link){
            this.data= val;
            this.next = link;
        }
    }
    // Create a Linked List with the help of Array
    public static ListNode createList(int[] values){
        if(values.length==0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode temp = head;
        for(int i=1;i<values.length;i++){
            temp.next = new ListNode(values[i]);
            temp = temp.next;
        }
        return head;
    }
    // Print a Linked List
    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    //size of Linked List
    public static int Size(ListNode head){
        ListNode temp = head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }

    //Remove at index
    public static ListNode removeAtIndex(ListNode head,int index){
        int size = Size(head);
        if(size==0){
            System.out.println("The List is Empty");
            return null;
        }
        if(index<0 || index>=size){
            System.out.println("The Inde is out of range");
            return null;
        }
        //Remove first node i.e head
        if(index ==0){
            head = head.next;
            return head;
        }
        ListNode temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    } 

    //add first 
    public static ListNode addfirst(ListNode head,int val){
        ListNode temp = new ListNode(val);
        if(head==null){
            return temp;
        }
        temp.next = head;
        head = temp;
        return head;
    }
    //remove first
    public static ListNode removefirst(ListNode head){
        int size = Size(head);
        if(size==0){
            System.out.println("List is Empty");
        }
        head = head.next;
        return head;
    }


     //Linked List stack adaptor
     public static class LinkedListStack {
        ListNode head = null;
        int size = 0;
        // Addd At first
        public void push(int val){
            ListNode temp = new ListNode(val);
            temp.next = head;
            head=temp;
            size++;
        }
        public int pop(){
            if(head==null){
                System.out.println("Stack underflow");
                return -1;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
        // Top
        public int top(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
        // is empty 
        public boolean isEmpty(){
            return head==null;
        }
        //size
        public int size(){
            return size;
        }
        //print stack 
        public void printStack(){
            ListNode temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
     }


    public static void main(String[] args) {
        int values[]={1,2,3,4};
        ListNode head = createList(values);
        System.out.println("Original List");
        printList(head);
        System.out.println(Size(head));

        //Remove Node at Index
        head = removeAtIndex(head, 2);
        System.out.print("List after remving 2 index: ");
        printList(head);

        //addFirst
        head = addfirst(head, 100);
        System.out.print("Adding First(100): ");
        printList(head);

        //removefirst
        head = removefirst(head);
        System.out.print("Removing first element: ");
        printList(head);

         // Stack operations
        System.out.println("\nStack Operations:");
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.print("After pushing 10, 20, 30: ");
        stack.printStack();

        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.print("After popping: ");
        stack.printStack();

        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Size: " + stack.size());


    }
}
