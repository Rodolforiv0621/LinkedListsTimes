// Rodolfo Rivera
//Project 1 Data Structure Timing
// 9/5/2021
package driver;

public class Driver {
    private static SinglyLinkedList singlyList = new SinglyLinkedList();
    private static DoublyLinkedList doublyList = new DoublyLinkedList();
    
    public static void main(String[] args) {
        System.out.println("This program shows time in nanoseconds, the amount of time insertion and deletion functions take on different types of linked lists");
        final long singlyInsertionTime0 = singlyLinkedListInsertionTime(100);
        final long singlyDeletionTime0 = singlyLinkedListDeletionTime(100);
        final long singlyInsertionTime1 = singlyLinkedListInsertionTime(1000);
        final long singlyDeletionTime1 = singlyLinkedListDeletionTime(1000);
        final long singlyInsertionTime2 = singlyLinkedListInsertionTime(10000);
        final long singlyDeletionTime2 = singlyLinkedListDeletionTime(10000);
        final long singlyInsertionTime3 = singlyLinkedListInsertionTime(100000);
        final long singlyDeletionTime3 = singlyLinkedListDeletionTime(100000);
        
        final long doublyInsertionTime0 = doublyLinkedListInsertionTime(100);
        final long doublyDeletionTime0 = doublyLinkedListDeletionTime(100);
        final long doublyInsertionTime1 = doublyLinkedListInsertionTime(1000);
        final long doublyDeletionTime1 = doublyLinkedListDeletionTime(1000);
        final long doublyInsertionTime2 = doublyLinkedListInsertionTime(10000);
        final long doublyDeletionTime2 = doublyLinkedListDeletionTime(10000);
        final long doublyInsertionTime3 = doublyLinkedListInsertionTime(100000);
        final long doublyDeletionTime3 = doublyLinkedListDeletionTime(100000);       
        
        System.out.println("Insertion");
        System.out.printf("%28d %9d %9d %11d", 100, 1000, 10000, 100000);
        System.out.print("\nSinglyLinkedList: ");
        System.out.printf("%13d %9d %9d %12d\n", singlyInsertionTime0, singlyInsertionTime1, singlyInsertionTime2, singlyInsertionTime3);
        System.out.print("DoublyLinkedList: ");
        System.out.printf("%13d %9d %9d %12d\n", doublyInsertionTime0, doublyInsertionTime1, doublyInsertionTime2, doublyInsertionTime3);
       
        System.out.println("\nDeletion");
        System.out.printf("%28d %9d %9d %11d", 100, 1000, 10000, 100000);
        System.out.print("\nSinglyLinkedList: ");
        System.out.printf("%11d %9d %9d %11d\n", singlyDeletionTime0, singlyDeletionTime1, singlyDeletionTime2, singlyDeletionTime3);
        System.out.print("DoublyLinkedList: ");
        System.out.printf("%12d %9d %8d %11d\n", doublyDeletionTime0, doublyDeletionTime1, doublyDeletionTime2, doublyDeletionTime3);
        
        // list.display();
    }
    
    public static long singlyLinkedListInsertionTime(int times){
        
         long startTime = System.nanoTime();
        for (int i = 0;i<times;i++){
            singlyList.insert("Hello World");
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
            doublyList.insertEnd("Hello World");
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
}
