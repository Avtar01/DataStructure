import java.util.Scanner;
public class question4 {

   public static void main(String[] args)

{
   int n;
   System.out.print("Input number of rows : ");
 Scanner sc = new Scanner(System.in);
		    n = sc.nextInt();

   for(int i=1;i<=n;i++)
   {
	for(int j=1;j<=i;j++)
	  System.out.print(j);

    System.out.println("");
    }
}
}