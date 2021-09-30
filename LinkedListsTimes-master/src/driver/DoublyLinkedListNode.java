package driver;
public class DoublyLinkedListNode {
    private String data;
    private DoublyLinkedListNode next;
    private DoublyLinkedListNode previous;
    
    public DoublyLinkedListNode(String data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }
    public String getData(){
        return this.data;
    }
    public void setNext(DoublyLinkedListNode next){
        this.next = next;
    }
    public void setPrevious(DoublyLinkedListNode previous){
        this.previous = previous;
    }
}
