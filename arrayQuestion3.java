import java.util.Scanner;

public class arrayQuestion3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n :");
    int n = sc.nextInt();
    System.out.println("Enter values : ");
    int[] array = new int[n];
    for(int i = 0;i<n;i++){
        array[i] = sc.nextInt();
    }
    // System.out.println("Sum of Elements are : ");
    // int sum =0;
    // for (int i = 0; i < n; i++) {

    //     sum = sum + array[i];
    // }
    // System.out.println(sum);
    // System.out.println("Sum of Alternate elements (Odd elememts) are : ");
    // int altSum = 0;
    // for (int i = 0; i < n; i++) {
    //     if(i%2==0)
    //      altSum = altSum + array[i];
    // }
    //   System.out.println(altSum);
    int temp;  
for (int i = 0; i < n; i++)   
        {  
            for (int j = i + 1; j < n; j++)   
            {  
                if (array[i] > array[j])   
                {  
                    temp = array[i];  
                    array[i] = array[j];  
                    array[j] = temp;  
                }  
            }  
        }  
       System.out.println("Second Highest Element is an array is : "+array[n-2]);
} 

}

