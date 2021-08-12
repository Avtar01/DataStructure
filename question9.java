import java.util.Scanner;
public class question9{
	public static void main(String[] args){
		int temp;
		int [] array = {1,2,3,4,5,6};

		for(int i = 0; i<array.length; i++){
			for(int j = i+1;j<array.length ; j++){
				if(array[i]>array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println("Third Highest Number is : " +array[array.length - 3]);
	}
}