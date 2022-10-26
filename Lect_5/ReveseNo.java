package Lect_5;

import java.util.Scanner;
   // Rev no. = Rev no. * 10 + (original no. % 10)  -> Rev no. *10 + last Digit --> (0*10+5=5 -> 5*10+8=58)
public class ReveseNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  long x=sc.nextInt();
		  
		  long ans=0;
			 while  (x>0)
			 {      
				 long rem=x%10;
				 ans= ans*10+rem;
		           x=x/10;
				}
			 System.out.println(ans);
			 
	}
}
