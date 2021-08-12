import java.io.*;  
import java.util.Scanner;  
public class question5 
{  
public static void main(String args[])  
{  
try  
{  

File file = new File("C:\\Users\\waheguru\\.vscode\\Desktop\\myWorkspace","Check.txt");       
Scanner sc=new Scanner(file);    //file to be scanned  
 
while(sc.hasNextLine())  
{  
System.out.println(sc.nextLine());      //returns the line that was skipped  
}  
sc.close();       
}  
catch(IOException e)  
{  
e.printStackTrace();  
}  
}  
}  
