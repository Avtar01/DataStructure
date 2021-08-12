import java.util.*;

public class NumberReverse {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence to reverse: ");
        while (in.hasNext()) {
            String temp = in.next();
            stack.push(temp);
            if(temp=="."){
                continue;
            }
        }
        System.out.println("Press CTRL+Z to stop and Press enter to See Reversed Stack : ");
        
        int n = stack.size();
        for(int i = n-1;i>=0;i--){
            System.out.println(stack.pop());
    }
        // while (stack.size() > 0) {
        //     reverse = reverse + " " + stack.pop();
        // }
        // System.out.println(reverse);
    }
}