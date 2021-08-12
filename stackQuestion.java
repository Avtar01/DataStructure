/*Use a stack to reverse the words of a sentence. 
Keep reading words until you have a word that ends in a period,
 adding them onto a stack. When you have a word with a period, 
 pop the words off and print them. Stop when there are no more words in the input.

Definition of Done
i.    You should convert the input as follows:
                          Mary had a little lamb. Its fleece was white as snow.
                                                       into
                        Lamb little a had mary. Snow as white was fleece its.
ii.    Display the desired resultant stack*/


import java.util.Stack;
import java.util.Scanner;

public class stackQuestion {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input : ");
        int n = stack.length();
        
        for(int i=0;i<n;i++){
            String value = sc.next();
            stack.push(value);
        }


        
    }
}
