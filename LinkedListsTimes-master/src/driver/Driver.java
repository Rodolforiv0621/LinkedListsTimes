// Rodolfo Rivera
//Project 1 Data Structure Timing
// 9/5/2021
//This project shows the timing for insertion and deletion methods on singly, doubly, circular singly, and doubly singly linked lists at the nth postion.
package driver;

public class Driver {
    private static SinglyLinkedList singlyList = new SinglyLinkedList();
    private static DoublyLinkedList doublyList = new DoublyLinkedList();
    private static CircularSinglyLinkedList circularSinglyList = new CircularSinglyLinkedList();
    private static CircularDoublyLinkedList circularDoublyList = new CircularDoublyLinkedList();
    
    public static void main(String[] args) {
      
        System.out.println("Insertion");
        System.out.printf("%28d %9d %9d %11d", 100, 1000, 10000, 100000);
        System.out.print("\nSinglyLinkedList: ");
        final long singlyInsertionTime0 = singlyLinkedListInsertionTime(100);
        final long singlyInsertionTime1 = singlyLinkedListInsertionTime(1000);
        final long singlyInsertionTime2 = singlyLinkedListInsertionTime(10000);       
        final long singlyInsertionTime3 = singlyLinkedListInsertionTime(100000);
        System.out.printf("%13d %9d %9d %12d\n", singlyInsertionTime0, singlyInsertionTime1, singlyInsertionTime2, singlyInsertionTime3);
        System.out.print("DoublyLinkedList: ");
        final long doublyInsertionTime0 = doublyLinkedListInsertionTime(100);
        final long doublyInsertionTime1 = doublyLinkedListInsertionTime(1000);
        final long doublyInsertionTime2 = doublyLinkedListInsertionTime(10000);
        final long doublyInsertionTime3 = doublyLinkedListInsertionTime(100000);
        System.out.printf("%13d %9d %9d %12d\n", doublyInsertionTime0, doublyInsertionTime1, doublyInsertionTime2, doublyInsertionTime3);
        System.out.print("CircularSinglyList: ");
        final long circularSinglyInsertionTime0 = circularSinglyInsertionTime(100);
        final long circularSinglyInsertionTime1 = circularSinglyInsertionTime(1000);
        final long circularSinglyInsertionTime2 = circularSinglyInsertionTime(10000);
        final long circularSinglyInsertionTime3 = circularSinglyInsertionTime(100000);
        System.out.printf("%11d %9d %9d %12d\n", circularSinglyInsertionTime0, circularSinglyInsertionTime1, circularSinglyInsertionTime2, circularSinglyInsertionTime3);
        System.out.print("CircularDoublyList: ");
        final long circularDoublyInsertionTime0 = circularDoublyInsertionTime(100);
        final long circularDoublyInsertionTime1 = circularDoublyInsertionTime(1000);
        final long circularDoublyInsertionTime2 = circularDoublyInsertionTime(10000);
        final long circularDoublyInsertionTime3 = circularDoublyInsertionTime(100000);     
        System.out.printf("%10d %9d %8d %11d\n", circularDoublyInsertionTime0, circularDoublyInsertionTime1, circularDoublyInsertionTime2, circularDoublyInsertionTime3);
        System.out.println("\nDeletion");
        System.out.printf("%28d %9d %10d %11d", 100, 1000, 10000, 100000);
        System.out.print("\nSinglyLinkedList: "); 
        final long singlyDeletionTime0 = singlyLinkedListDeletionTime(100);
        final long singlyDeletionTime1 = singlyLinkedListDeletionTime(1000);
        final long singlyDeletionTime2 = singlyLinkedListDeletionTime(10000);        
        final long singlyDeletionTime3 = singlyLinkedListDeletionTime(100000);
        System.out.printf("%11d %9d %10d %11d\n", singlyDeletionTime0, singlyDeletionTime1, singlyDeletionTime2, singlyDeletionTime3);
        System.out.print("DoublyLinkedList: ");     
        final long doublyDeletionTime0 = doublyLinkedListDeletionTime(100);
        final long doublyDeletionTime1 = doublyLinkedListDeletionTime(1000);
        final long doublyDeletionTime2 = doublyLinkedListDeletionTime(10000);
        final long doublyDeletionTime3 = doublyLinkedListDeletionTime(100000);
        System.out.printf("%12d %9d %9d %11d\n", doublyDeletionTime0, doublyDeletionTime1, doublyDeletionTime2, doublyDeletionTime3);
        System.out.print("CircularSinglyList: ");
        final long circularSinglyDeletionTime0 = circularSinglyDeletionTime(100);
        final long circularSinglyDeletionTime1 = circularSinglyDeletionTime(1000);
        final long circularSinglyDeletionTime2 = circularSinglyDeletionTime(10000);
        final long circularSinglyDeletionTime3 = circularSinglyDeletionTime(100000);
        System.out.printf("%13d %9d %9d %10d\n", circularSinglyDeletionTime0, circularSinglyDeletionTime1, circularSinglyDeletionTime2, circularSinglyDeletionTime3);
        System.out.print("CircularDoublyList: ");
        final long circularDoublyDeletionTime0 = circularDoublyDeletionTime(100);
        final long circularDoublyDeletionTime1 = circularDoublyDeletionTime(1000);
        final long circularDoublyDeletionTime2 = circularDoublyDeletionTime(10000);
        final long circularDoublyDeletionTime3 = circularDoublyDeletionTime(100000);
        System.out.printf("%10d %9d %9d %11d\n", circularDoublyDeletionTime0, circularDoublyDeletionTime1, circularDoublyDeletionTime2, circularDoublyDeletionTime3);
        
        
    }
    
    public static long singlyLinkedListInsertionTime(int times){
        
         long startTime = System.nanoTime();
        for (int i = 0;i<times;i++){
            singlyList.insert("Singly Linked");
        }
         long endTime = System.nanoTime();
         //System.out.println("insertion: " + list.size() + " ");
         
         if(times == 100){
            return (endTime-startTime);
         }else if(times == 1000){
             return (endTime-startTime);
         }else if(times == 10000){
             return (endTime-startTime);
         }else if(times == 100000){
             return (endTime-startTime);
         }else{
             return 0;
         }
         
    }
    public static long singlyLinkedListDeletionTime(int times){
        long startTime = System.nanoTime();
        for (int i = 0;i<times;i++){
            singlyList.delete();
        }
         long endTime = System.nanoTime();
         //System.out.println("deletion: " + list.size() + " ");        
         if(times == 100){
            return (endTime-startTime);
         }else if(times == 1000){
             return (endTime-startTime);
         }else if(times == 10000){
             return (endTime-startTime);
         }else if(times == 100000){
             return (endTime-startTime);
         }else{
             return 0;
         }
    }
    public static long doublyLinkedListInsertionTime(int times){
        
         long startTime = System.nanoTime();
        for (int i = 0;i<times;i++){
            doublyList.insertEnd("Doubly Linked");
        }
         long endTime = System.nanoTime();
         //System.out.println("insertion: " + doublyList.size() + " ");
         
         if(times == 100){
            return (endTime-startTime);
         }else if(times == 1000){
             return (endTime-startTime);
         }else if(times == 10000){
             return (endTime-startTime);
         }else if(times == 100000){
             return (endTime-startTime);
         }else{
             return 0;
         }
         
    }
    public static long doublyLinkedListDeletionTime(int times){
        long startTime = System.nanoTime();
        for (int i = 0;i<times;i++){
            doublyList.delete();
        }
         long endTime = System.nanoTime();
         //System.out.println("deletion: " + doublyList.size() + " ");        
         if(times == 100){
            return (endTime-startTime);
         }else if(times == 1000){
             return (endTime-startTime);
         }else if(times == 10000){
             return (endTime-startTime);
         }else if(times == 100000){
             return (endTime-startTime);
         }else{
             return 0;
         }
    }
    public static long circularSinglyInsertionTime(int times){
        long startTime = System.nanoTime();
        for (int i = 0;i<times;i++){
            circularSinglyList.insert("Circular Singly");
        }
         long endTime = System.nanoTime();
         //System.out.println("insertion: " + doublyList.size() + " ");        
         if(times == 100){
            return (endTime-startTime);
         }else if(times == 1000){
             return (endTime-startTime);
         }else if(times == 10000){
             return (endTime-startTime);
         }else if(times == 100000){
             return (endTime-startTime);
         }else{
             return 0;
         }
    }
    public static long circularSinglyDeletionTime(int times){
        long startTime = System.nanoTime();
        for (int i = 0;i<times;i++){
            circularSinglyList.delete();
        }
         long endTime = System.nanoTime();
         //System.out.println("deletion: " + doublyList.size() + " ");        
         if(times == 100){
            return (endTime-startTime);
         }else if(times == 1000){
             return (endTime-startTime);
         }else if(times == 10000){
             return (endTime-startTime);
         }else if(times == 100000){
             return (endTime-startTime);
         }else{
             return 0;
         }
    }
    public static long circularDoublyInsertionTime(int times){
        long startTime = System.nanoTime();
        for (int i = 0;i<times;i++){
            circularDoublyList.insert("Circular Singly");
        }
         long endTime = System.nanoTime();
         //System.out.println("Insertion: " + doublyList.size() + " ");        
         if(times == 100){
            return (endTime-startTime);
         }else if(times == 1000){
             return (endTime-startTime);
         }else if(times == 10000){
             return (endTime-startTime);
         }else if(times == 100000){
             return (endTime-startTime);
         }else{
             return 0;
         }
    }
    public static long circularDoublyDeletionTime(int times){
        long startTime = System.nanoTime();
        for (int i = 0;i<times;i++){
            circularDoublyList.delete();
        }
         long endTime = System.nanoTime();
         //System.out.println("deletion: " + doublyList.size() + " ");        
         if(times == 100){
            return (endTime-startTime);
         }else if(times == 1000){
             return (endTime-startTime);
         }else if(times == 10000){
             return (endTime-startTime);
         }else if(times == 100000){
             return (endTime-startTime);
         }else{
             return 0;
         }
    }
}
