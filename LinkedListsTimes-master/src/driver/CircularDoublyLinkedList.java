package driver;
public class CircularDoublyLinkedList {
   private DoublyLinkedListNode head = null;
   private int size = 0;
   public void insert(String data){
       DoublyLinkedListNode node = new DoublyLinkedListNode(data);
       if(head == null){
           head = node;
           node.setNext(node);
           node.setPrevious(node);
           size++;
       }else{
           DoublyLinkedListNode last = head.getPrevious();
           node.setNext(head);
           head.setPrevious(node);
           node.setPrevious(last);
           last.setNext(node);
           size++;
       }
   }
   public void delete(){
       DoublyLinkedListNode last = head.getPrevious();
       DoublyLinkedListNode NewLast = last.getPrevious();
       if(head == null){
            return;
        }
        if(size == 1){
            head = null;
            size--;
            return;
        }
        
        last.setNext(null);
        NewLast.setNext(head);
        last.setPrevious(null);
        head.setPrevious(NewLast);
        
        size--;
   }
   public void display(){
        DoublyLinkedListNode node = head;
        do{
            System.out.println(node.getData()+" ");
            node = node.getNext();
        }while(node!=head);
        System.out.println();

    }
   public int size(){
       return this.size;
   }
}
