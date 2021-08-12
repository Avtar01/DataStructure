/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		Set<Integer> hash_Set = new HashSet<Integer>();
		for(int i=0;i<n;i++){
  
        hash_Set.add(a);
        hash_Set.add(b);
        hash_Set.add(c);
        hash_Set.add(d);
        
        
		}
  
        System.out.println(hash_Set);
	}
}
