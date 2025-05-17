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
        int sizeLL(){
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
    }
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.addLast(10);
        li.addLast(20);
        li.addLast(30);
        li.addLast(40);
        // li.deleteFirst();
        // li.deleteFirst();
        li.printLL();
        int b = li.getFirst();
        int l = li.getLast();
        int c = li.getAt(2);
    }

}