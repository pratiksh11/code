public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        //step1=create new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2-newnode next=head
        newNode.next=head;
        //step3 -head=newnode
        head=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;

        }
        System.out.println();
    }
    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);

    }
}
