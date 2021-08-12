import java.util.*;

class stack{

public static void main(String[] args){
    Stack<Integer> stack = new Stack<>();
    stack.push(100);
    stack.push(200);
    stack.push(300);
    stack.push(400);
    stack.push(500);
    System.out.println("Proper stack : " +stack);
    System.out.println("Element at top before removing : "+stack.pop());
    System.out.println("Element at the top after removing : "+stack.peek());
    System.out.println("is stack empty ? : " +stack.empty());
    System.out.println("Search position in stack : "+stack.search(300));
    
}
}