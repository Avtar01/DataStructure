import java.util.Scanner;
class question1 {  
    public static void main(String[] args) {      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of your list : ");
        int n = sc.nextInt();
        int [] arr = new int[n]; 
        System.out.println("Enter Elements of your list : ");  
        for(int i = 0;i<n;i++){
        	arr[i] = sc.nextInt();
        }
        System.out.println("List of Duplicate Elements is  : ");  
        

        for(int i = 0; i < arr.length; i++) {  

            for(int j = i + 1; j < arr.length; j++) {  

                if(arr[i] == arr[j])  
                    System.out.print(arr[j]+"\t");  
            }  
        }  
    }  
}  