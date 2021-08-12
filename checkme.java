import java.util.Scanner;

public class checkme {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);System.out.println("Enter n :");
    int n = sc.nextInt();System.out.println("Enter values : ");
    int[] array = new int[n];
    for(int i = 0;i<n;i++)
    {
        array[i] = sc.nextInt();
    }
    System.out.println("Array Before Swaping  : ");
    for (int i = 0; i < n; i++) {
        System.out.println(array[i]);
    }
array[0] = array[0] + array[n-1];
array[n-1] = array[0] - array[n-1];
array[0] = array[0] - array[n-1];
System.out.println("Array after swaping the elements : ");
for(int i =0;i<n;i++){
System.out.println(array[i]);
}

    }}
