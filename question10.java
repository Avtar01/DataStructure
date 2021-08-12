import java.util.Scanner;
public class question10{
	public static void main(String[] args){
		int X , Y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X : ");
		X = sc.nextInt();
		System.out.println("Enter Y : ");
		Y = sc.nextInt();
		X = X + Y;
		Y = X - Y;
		X = X -Y ;
		System.out.println("Swaped Numbers are : " +X+ " and " +Y);
	}
}