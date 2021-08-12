import java.util.Scanner;
public class question2 {

  public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input an integer: ");
      int num = sc.nextInt();

	  System.out.println("The sum is " + integersum(num));
    }

 public static int integersum(long n) {
		int sum = 0;
		
		while(n > 0) {
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}
	
 }
