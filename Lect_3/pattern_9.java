package Lect_3;

import java.util.Scanner;

public class pattern_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		  int row=1;
		  int nst=1;
		while(row<=2*x-1)
		 {
			 int cst=1;
			 while(cst<=nst)
			 {
				 System.out.print("* ");
				 cst++;
			 }
			 System.out.println();
			 if (row<=(((2*x)-1)/2)) {
			 nst=nst+1;
			 }
			 else {
				 nst=nst-1;
			 }
			 row=row+1;
		 }
	   }
	}

