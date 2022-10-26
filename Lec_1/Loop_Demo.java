package Lec_1;

import java.util.Scanner;

public class Loop_Demo {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number: ");
			  int x=sc.nextInt();
			  
			  int counter=1;
	       	  while (counter<=x)
		{
	       	System.out.println("Hi");
	       	counter=counter+1;
		}
	       	
	}
}
