package Lect_5;

import java.util.Scanner;

public class Palindrome_Check {
                                                   //if Reverse no==Original No. --> Palindome
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  long x=sc.nextInt();
		  
		  long revno=0;
		  long tempx = x; 
			 while  (tempx>0)
			 {      
				
				 revno= revno*10 + (tempx%10);
		           tempx=tempx/10;
				}
			 if(x==revno) {
			 System.out.println("Palindrome");
			 }
			 else {
				 System.out.println("Not Palindrome");
			 }
	}

}
//Negative numbers can not be palindromes.
//We can solve this problem without converting integer to string but only for integers less than 1018.
//We are dividing the input number N by 10 in every iteration. So, there is going to be a total of log10(N) iterations.  ((  TimeComplexity  -> 0(log10(N))  ))