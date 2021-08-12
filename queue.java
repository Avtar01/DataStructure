import java.util.*;
public class queue {
    public static void main(String[] args) {
        
    
    Queue<String> queue = new LinkedList<>();
    //insert elements
    queue.add("Apple");
    queue.add("Saamsung");
    queue.add("Nokia");
    queue.add("One Plus");
    queue.add("Asus");
    System.out.println(queue);
    System.out.println("Element going to remove from front using remove(),it will throws exception : "+queue.remove());
    System.out.println("Element at the front : "+queue.peek());
    System.out.println("Updated List : "+queue);
    System.out.println("Removing element from poll() , it returns null if no element : "+queue.poll());
    System.out.println("Updated List : " + queue);
    queue.add("Xiomi");
    queue.add("Oppo");
    queue.add("Vivo"); //it will throws exception if no space is available
    System.out.println("Updated List : " + queue);
    queue.offer("Realme");//it will not throw exception but add will
    System.out.println(queue.element());//it will throw an axception but peak will not
    System.out.println(queue);
    Iterator<String> itr = queue.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    List<String> list =  new LinkedList<>();
    list.listIterator(); 
    //It will only work which support list interface onlly 

    }
}
