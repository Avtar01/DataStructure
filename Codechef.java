import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int G1=0;
		int G2=0;
		int B1=0;
		int B2=0;
		int S1=0;
		int S2=0;
		

		

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(n--){
		     G1 = sc.nextInt();
		     G2 = sc.nextInt();
		  S1 = sc.nextInt();
		     S2 = sc.nextInt();
		  B1 = sc.nextInt();
		     B2 = sc.nextInt();

		if((G1+S1+B1)>(G2+S2+B2)){
		    System.out.println("1");
		
		}else{
		    System.out.println("2");
		}
		}
		
	}
}
