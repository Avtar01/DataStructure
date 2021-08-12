import java.util.Scanner;

public class arrayQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        System.out.println("Enter values : ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array element at even index are  : ");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { //Checking index
                System.out.println(array[i] + " at index " + i);
            }
        }
        System.out.println("odd elements in given array : ");
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 != 0) { //Checking an element
                System.out.println(array[i]);
            }
        }
        System.out.println("Array in reverse Order is : ");
        for (int i = n-1  ; i >= 0; i--) {
            System.out.println(array[i]);
        }
        System.out.println("First Element is: " + array[0] + " and Last ELement is: " + array[n - 1]);
        
       
    }
}
