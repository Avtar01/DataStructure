import java.util.*;
public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        //Inserting
        pQueue.add(100);
        pQueue.add(50);
        pQueue.add(70);
        pQueue.add(40);
        pQueue.add(200);
        pQueue.add(180);
        
        System.out.println(pQueue);
        //System.out.println("Element with the highest priority is : "+pQueue.remove());
        //System.out.println(pQueue);
        System.out.println("Element with the root is : " + pQueue.peek());
        pQueue.add(10);
        System.out.println(pQueue);
        System.out.println(pQueue.poll());
        System.out.println(pQueue);
        Iterator<Integer> itr = pQueue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        PriorityQueue<String> pQueue2 = new PriorityQueue<>();
        pQueue2.add("john");
        pQueue2.add("sam");
        pQueue2.add("kate");
        pQueue2.add("harry");
        pQueue2.add("Harold");
        pQueue2.add("Betty");
        pQueue2.add("Sunny");
        System.out.println(pQueue2);


}}

