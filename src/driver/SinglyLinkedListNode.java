
package driver;

public class SinglyLinkedListNode {
    private String data;
    private SinglyLinkedListNode next;
    
    public SinglyLinkedListNode(String data){
        this.data = data;
        next = null;
    }
    public SinglyLinkedListNode getNext(){
        return this.next;
    }
    public void setNext(SinglyLinkedListNode node){
         this.next = node; 
    }
    public String getData(){
        return this.data;
    }
}
