public class _1addlast {
   public static class Node{
    int data;
    Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        void addLast(int val){
            Node temp=new Node();
            temp.data = val;
            temp.next=null;
            if(size==0){
                head=tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        int getSize(){
            return size;
        }
        void printLL(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        void deleteFirst(){
            if(size==0){
                System.out.println("List is empty");
            }
            else if(size==1){
                head=tail=null;
                size=0;
            }
            else{
                head = head.next;
                size--;
            }
        }
        int getFirst(){
            if(size==0){
                System.out.println("List is Empty");
                return -1;
            }
            else{
                System.out.println(head.data);
                return head.data;
            }
        }
        int getLast(){
            if(size==0){
                System.out.println("List is Empty");
                return -1;
            }
            else{
                System.out.println(tail.data);
                return tail.data;
            }
        }

        int getAt(int idx){
            if(size==0){
                System.out.println("List is Empty");
                return -1;
            }
            else if(idx<0 || idx>size){
                System.out.println("Invalid Index");
                return -1;
            }
            else{
                Node temp = head;
                for(int i=0;i<idx;i++){
                    temp=temp.next;
                }
                System.out.println(temp.data);
                return 0;
            }
        }
        //added addresss
        void getAddress(){
            Node temp = head;
            System.out.println("Address:");
            while(temp!=null){
                System.out.print(temp+" ");
                temp=temp.next;
            }
        }

        //add first in LL
        void addFirst(int val){
            Node temp = new Node();
            temp.data=val;
            temp.next=null;
            if(size==0){
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
            size++;
        }

        void addAtIndex(int idx,int val){
            Node temp=new Node();
            temp.data=val;
            temp.next=null;
            if(idx==0){
                temp.next=head;
                head=temp;
            }
            else if(idx==size){
                tail.next=temp;
                tail=temp;
            }
            else if(idx<0 || idx>size){
                System.out.println("Invalid Index");
            }
            else{
                Node r = head;
                for(int i=0;i<idx-1;i++){
                    r = r.next;
                }
                temp.next=r.next;
                r.next=temp; 
            }
            size++;
        }


        void removeLast(){
            if(size==0){
                System.out.println("List is empty");
            }
            else if(size==1){
                head=tail=null;
                size=0;
            }
            else{
                Node temp = head;
                System.out.println(size);
                for(int i=0;i<size-2;i++){
                    temp = temp.next;
                }
                tail=temp;
                temp.next=null;
                size--;
            }
            
        }
    }
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        System.out.print("Added  last: ");
        li.addLast(10);
        li.addLast(20);
        li.addLast(30);
        li.addLast(40);
        li.printLL();

        System.out.println();
        li.removeLast();
        li.printLL();




        // System.out.println("Size:"+li.getSize());

        // System.out.print("Added  First(9): ");
        // li.addFirst(9);
        // li.printLL();
        // System.out.println("Size:"+li.getSize());

        // System.out.println("adding at specific index:");
        // li.addAtIndex(0, 200);
        // li.addAtIndex(5, 12);
        // li.addAtIndex(2, 5);
        // li.printLL();
        // li.deleteFirst();
        // li.deleteFirst();
        // li.printLL();
        // int b = li.getFirst();
        // int l = li.getLast();
        // int c = li.getAt(2);
        // li.getAddress();
    }

}