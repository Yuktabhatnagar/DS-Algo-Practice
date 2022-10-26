package Lect_5;
import java.util.Scanner;
public class Check_Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int x=sc.nextInt();
		  
		  int i=2;
		  int fact=0;
		  while(i<x)
		  {
			  if(x%i==0)
				  {
				  fact++;
				  break;
				  }
			  i++;
		  }
 if(fact==0)
 {
	 System.out.println("Prime Number");
 }
 else {
	 System.out.println("Non-Prime Number");
 }
	}

}
