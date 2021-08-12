import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

class linkedlist{

public static void main(String[] args){
    LinkedList<String> list = new LinkedList<>();
    list.add("India");
    list.add("USA");
    list.add("Russia");
    list.add("japan");
    list.add("canada");
    System.out.println(list);
list.addFirst("Nepal");
System.out.println(list);
System.out.println(list.get(3));
list.removeLast();
System.out.println(list);
System.out.println("Changes after removing the last element: "+list);

Iterator itr = list.iterator();
list.set(2,"China");

while(itr.hasNext()) {
System.out.println(itr.next());
}
ListIterator listItr = list.listIterator();
while(listItr.hasNext()){
    System.out.println(list);
}
System.out.println("Traversing ...");
while(listItr.hasPrevious()){
    System.out.println(list);
}
}}