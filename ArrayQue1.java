import java.util.Scanner;
public class ArrayQue1 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    
    int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
    
    System.out.println("Enter the Number You want to find in array : ");
    int num = sc.nextInt();
    for(int i = 0;i<11;i++)
    {
        if(num==array[i]){
            System.out.println("Entered Element is " +num+ " and present at position " +(i+1));
            break;
        }
        else{
            continue;
            

        }
    }
    // in
    // System.out.println("Array Before Swaping  : ");
    // for (int i = 0; i < n; i++) {
    //     System.out.println(array[i]);
    // }
    // int m = n + 1;

    
    // int total = m * (m + 1) / 2;
    // for(int i = 0;i<n;i++)
    // {
    //     System.out.println(array[i]);
    // }
    // int sum=0;
    // for(int i = 0;i<n;i++){
    //     sum = sum + array[i];
    // }
    
    // System.out.println("Missing Number is : "+(total-sum));



// array[0] = array[0] + array[n-1];
// array[n-1] = array[0] - array[n-1];
// array[0] = array[0] - array[n-1];
// System.out.println("Array after swaping the elements : ");
// for(int i =0;i<n;i++){
// System.out.println(array[i]);
// }




}
}
