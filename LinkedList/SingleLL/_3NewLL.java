

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
    public static  class linkedListOperations{
        ListNode head = null;
        ListNode tail = null;
        int size = 0;
        public void  createList(int[] values){
            if(values.length==0) 
            System.out.println("Empty Array");;
            head = new ListNode(values[0]);
            ListNode temp = head;
            for(int i=1;i<values.length;i++){
                temp.next = new ListNode(values[i]);
                temp = temp.next;
            }
            tail = temp;
        }
    // Print a Linked List
        public void printList(){
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
    
    //Q)Return Kth element from the last
    // public void reverseLL(){
    //     ListNode prev = null;
    //     ListNode curr = head;
    //     while(curr!=null){
    //         ListNode nextNode = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = nextNode;
    //     }
    //     head = prev;
    // }
    // public int kthelement(int idx){
    //     reverseLL();
    //     ListNode temp = head;
    //     for(int i=0;i<idx-1;i++){
    //         temp=temp.next;
    //     }
    //     System.out.println("Kthe element"+idx+" : "+temp.data);
    //     return 0;
    // }
    //     public int kthelement(int idx){
    //         ListNode s = head;
    //         ListNode f = head;
    //         for(int i=0;i<idx;i++){
    //             if (f == null) {
    //             System.out.println("Index out of bounds");
    //             return -1;
    //         }
    //             f =f.next;
    //         }
    //         while(f!=tail){
    //             s = s.next;
    //             f =f.next;
    //         }
    //         System.out.println("Kthe element"+idx+" : "+s.data);
    //         return 0;
    //     }
    // }




    // Q)return Middle of the linked List [No size should be used,one traversal]
    // public int middleOfTheLL(){
    //     ListNode slow = head;
    //     ListNode fast = head;
    //     while(fast.next!=null && fast.next.next!=null){
    //         fast = fast.next.next;
    //         slow=slow.next;
    //     }
    //     System.out.println("Middle of the list:"+slow.data);
    //     return slow.data;
    // }
    







}


     //Linked List stack adaptor
    //  public static class LinkedListStack {
    //     ListNode head = null;
    //     int size = 0;
    //     // Addd At first
    //     public void push(int val){
    //         ListNode temp = new ListNode(val);
    //         temp.next = head;
    //         head=temp;
    //         size++;
    //     }
    //     public int pop(){
    //         if(head==null){
    //             System.out.println("Stack underflow");
    //             return -1;
    //         }
    //         int val = head.data;
    //         head = head.next;
    //         size--;
    //         return val;
    //     }
    //     // Top
    //     public int top(){
    //         if(head==null){
    //             System.out.println("Stack is empty");
    //             return -1;
    //         }
    //         return head.data;
    //     }
    //     // is empty 
    //     public boolean isEmpty(){
    //         return head==null;
    //     }
    //     //size
    //     public int size(){
    //         return size;
    //     }
    //     //print stack 
    //     public void printStack(){
    //         ListNode temp = head;
    //         while(temp!=null){
    //             System.out.print(temp.data+" ");
    //             temp = temp.next;
    //         }
    //         System.out.println();
    //     }
    //  }

    // Queue Adaptor
    // public static class LinkedListQueue{
    //     ListNode head = null;
    //     ListNode tail = null;
    //     int size =0;
    //     public void  add(int val){
    //         // addlast
    //         ListNode newNode = new  ListNode(val);
    //         if(head==null){
    //             head = newNode;
    //             tail = newNode;
    //         }
    //         else{
    //             tail.next = newNode;
    //             tail = newNode;
    //         }
    //         size++;
    //     }
    //     public void remove(){
    //         // removefirst
    //         if(size==0){
    //             System.out.println("Queue underflow");
    //         }
    //         System.out.println("Removed element:"+head.data);
    //         head = head.next;
    //         size--;
    //     }
    //     public int peek(){
    //         // list.getfirstNode
    //         if(size==0){
    //             System.out.println("queue is empty");
    //             return -1;
    //         }
    //         System.out.println(head.data);
    //         return head.data;
    //     }
    //     public int size(){
    //         return size;
    //     }
    //     public void printqueue(){
    //         ListNode temp = head;
    //         while(temp!=null){
    //             System.out.print(temp.data+" ");
    //             temp=temp.next;
    //         }
    //         System.out.println();
    //     }
    // }


    



    public static void main(String[] args) {
        // int values[]={1,2,3,4};
        // linkedListOperations ll = new linkedListOperations();
        // ll.createList(values);
        // System.out.println("Original List");
        // ll.printList();
        // // ll.kthelement(2);
        // // ll.printList();
        // ll.middleOfTheLL();




        // Stack operations
        // System.out.println("\nStack Operations:");
        // LinkedListStack stack = new LinkedListStack();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.print("After pushing 10, 20, 30: ");
        // stack.printStack();
        // System.out.println("Top: " + stack.top());
        // System.out.println("Pop: " + stack.pop());
        // System.out.print("After popping: ");
        // stack.printStack();
        // System.out.println("Is Empty: " + stack.isEmpty());
        // System.out.println("Size: " + stack.size());




        //Queue Operations 
        // System.out.println("\nQueue Operations:");
        // LinkedListQueue queue = new LinkedListQueue();
        // queue.add(10);
        // queue.add(20);
        // queue.add(30);
        // queue.add(40);
        // queue.printqueue();//152 235
        // queue.peek();
        // queue.remove();
        // queue.printqueue();


    }
    
}
