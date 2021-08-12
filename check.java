import java.util.*;

public class check {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = a.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = a.nextInt();
        }
        int max = arr[0]; int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];

            else if (arr[i] < min)
                
            min = arr[i];
        }
        System.out.println("The smallest element is: " + min);
        System.out.println("The largest element is: " + max);
        System.out.println("The difference between them is: " + (max - min));
    }
}