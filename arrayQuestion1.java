import java.util.Scanner;

class arrayQuestion1{

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n :");
    int n = sc.nextInt();
    System.out.println("Enter values : ");
    int[] array = new int[n];
    for(int i = 0;i<n;i++){
        array[i] = sc.nextInt();
    }
    System.out.println("You have Entered : ");
    for (int i = 0; i < n; i++) {
        System.out.println(array[i]);
    }
    int large, small;
    large = small = array[0];
    for (int i = 1; i < n; ++i) {
        
        if (array[i] > large)
            large = array[i];

        else if (array[i] < small)
            small = array[i];
    }
System.out.println("The smallest element is " + small );
System.out.println("The largest element is " + large );
System.out.println("The Difference between them is " + (large-small) );

}
}
// System.out.println("On reversing, Array changes to: ");for(

// int i = n - 1;i>=0;i--)
// {
//             System.out.println(array[i]);
//         }