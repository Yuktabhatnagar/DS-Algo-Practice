package Lec_2;
import java.util.*;

public class SumNno{ 

	public static void main(String[] arg){
		//Keep summing numbers till we get the destined value.
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int a=sc.nextInt();
	
		int x=0;
		int sum=0;
		while(x<=a)
		{
		 sum=sum+x;
		 x=x+1;
		}
	 System.out.println("Sum of nth Numbers : "+ sum);
	
	}

}

