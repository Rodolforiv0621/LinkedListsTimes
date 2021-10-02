package driver;
public class CircularSinglyLinkedList {
private SinglyLinkedListNode head = null;
private int size = 0;
public void insert(String data){
    SinglyLinkedListNode node = new SinglyLinkedListNode(data);
    if(head == null){
        head = node;
        head.setNext(head);
        size++;
    }else{
        SinglyLinkedListNode start = head;
        do{
            start = start.getNext();
            
        }while(start.getNext()!= head);
        start.setNext(node);
        node.setNext(head);
        size++;
        
    }
    
}
public void display(){
        SinglyLinkedListNode node = head;
        do{
            System.out.println(node.getData()+" ");
            node = node.getNext();
        }while(node!=head);
        System.out.println();

    }
public int find(String data){
        SinglyLinkedListNode temp = head;
        int index = 0;
        if(head == null){
            return -1;
        }
        
        do{
            if(temp.getData() == data){
                return index;
            }
            temp = temp.getNext();
            index++;

            
            
        }while(temp != head);
        return -1;
    }

public void delete(){
    SinglyLinkedListNode node = head;
    do{
         node = node.getNext();
        }while(node.getNext().getNext()!=head);
      SinglyLinkedListNode next  = node.getNext().getNext();
      node.setNext(next);
       
    size--;
}

public int size(){
    return this.size;
}
}
