public class _2revsers {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int  size;
        void addLast(int val){
            Node temp=new Node();
            temp.data=val;
            temp.next=null;
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        void printLi(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        // Reverse a Linked List
        public void reverse(){
            int li  = 0;
            int ri= size-1;
            while(li<ri){
                Node left = getNodeAt(li);
                Node right = getNodeAt(ri);
                 
                int dummy = left.data;
                left.data = right.data;
                right.data = dummy;
                li++;
                ri--;
            }

        }

        private Node getNodeAt(int idx){
            Node temp = head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp;
        }
    }

    public static void main(String[] args) {
        LinkedList li= new LinkedList();
        li.addLast(10);
        li.addLast(20);
        li.addLast(30);
        li.addLast(40);
        li.addLast(50);
        li.reverse();
        li.printLi();
    }
}
