package Lect_3;

import java.util.Scanner;

public class pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		int row=1;
		int nst=x;
		int nsp=0;
		while (row<=x ) {
			int csp=1;
			while (csp<=nsp)
			{
				System.out.print("  ");
		    	csp++;
		    }
			int cst=1;
			while(cst<=nst)
			{
				
				System.out.print("* ");
				cst++;
				
			}
			System.out.println();
			nsp=nsp+2;
			nst--;
			row++;
		
	}

	}
}
