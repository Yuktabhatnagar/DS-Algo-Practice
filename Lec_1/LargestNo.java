package Lec_1;

import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		  int n1=sc.nextInt();
		  int n2=sc.nextInt();
		  
		if(n1>n2)
		{
			System.out.println(n1+" is largest");
		}
		else {
			System.out.println(n2 +" is Largest");
		}
	}

}
