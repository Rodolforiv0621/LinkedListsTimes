package driver;

public class DoublyLinkedList {
    private DoublyLinkedListNode head = null;
    private int size = 0;
    
    public void insertEnd(String data){
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        if(head == null){
            head = node;
            size++;
        }else{
            DoublyLinkedListNode start = head;
           while(start.getNext() != null){
               start = start.getNext();
            } 
           start.setNext(node);
           node.setPrevious(start);
           size++;
        }
        
        
    }
    public int find(String data){
        DoublyLinkedListNode temp = head;
        int index = 0;
        if(temp == null){
            return -1;
        }
        while(temp != null){
            if(temp.getData() == data){
                return index;
            }
            temp = temp.getNext();
            index++;
        }
        return -1;
    }
    public void delete(){
        DoublyLinkedListNode temp = head;
        if(head == null){
            return;
        }
        if(size == 1){
            return;
        }else{
        temp.getNext().setPrevious(null);
        }
        head = head.getNext();
        temp.setNext(null);
        size--;
    }
    public int size(){
        return this.size;
    }
}
