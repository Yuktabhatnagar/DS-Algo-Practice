package Lect_3;

import java.util.Scanner;

public class Pattern_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		  int row=1;
		  int nsp=x-1;
		  int nst=1;
		while(row<=2*x-1)
		 {
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			
			 int cst=1;
			 while(cst<=nst)
			 {
				 System.out.print("*");
				 cst++;
			 }
			 System.out.println();

			 if (row<=((2*x)-1)/2) {
			 nsp=nsp-1;
			 nst=nst+1;
			 }
			 else {
				 nsp++;
				 nst=nst-1;
			 }
			 row=row+1;
		 }
	}
	}
