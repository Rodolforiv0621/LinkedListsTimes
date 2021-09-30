package driver;

public class SinglyLinkedList {
    private SinglyLinkedListNode head = null;
    private int size = 0;
    
    public void insert(String data){
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if(head == null){
            head = node; 
            size++;
        }else{                 
            SinglyLinkedListNode start = head;
            while(start.getNext() != null){
                start = start.getNext();
            }
            start.setNext(node);
            size++;
        }
    }
    public void delete(){
        SinglyLinkedListNode temp = head;
        head = temp.getNext();
        size--;
    }
    public void display(){
        SinglyLinkedListNode node = head;
        while(node != null){
            System.out.println(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }
    public void setHead(SinglyLinkedListNode n){
        this.head = n;
    }
    public int size(){
        return this.size;
    }
}
