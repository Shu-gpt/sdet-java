import jdk.jshell.spi.SPIResolutionException;

class LinkedList{
    class Node{
        int data;
        Node next;
         Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void addNumber(int number){
        Node newNode=new Node(number);
        if(head==null){
            head=newNode;

        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    public void printLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void deleteNumber(int number){
        Node temp=head;
        Node Prev=null;
        while(temp.next!=null){
            if(temp.data==number){
                Prev.next=temp.next;
                break;
            }
            else{
                Prev=temp;
                temp=temp.next;
            }
        }
        head=Prev;
    }
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addNumber(12);
        ll.addNumber(10);
        ll.addNumber(13);
        ll.deleteNumber(10);
        ll.printLinkedList();
    }
}