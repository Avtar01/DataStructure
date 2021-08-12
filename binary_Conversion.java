import java.util.*;
public class binary_Conversion {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
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
        System.out.println("1's Compliment of Given Element is : ");
        System.out.println(list);
        list.set(n-1, 1);
    }
}
