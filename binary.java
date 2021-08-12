
import java.util.*;

public class binary {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Binary Code that you want to Convert : ");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int ai = sc.nextInt();
            if(ai==1){
                int bi = 0;
                
                list.add(bi);
            }else if(ai==0){
                int bi = 1;
                list.add(bi);
            }else{
                System.out.println("Please Enter Binary Code Only !!");
            }
            

    }
    System.out.println(list);
    ListIterator<Integer> iterator = list.listIterator();
    
    if(iterator.next().equals(1)){
        
    }

    
{
}
}
}