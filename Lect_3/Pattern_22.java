package Lect_3;

import java.util.Scanner;

public class Pattern_22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int row = 2;
		int nsp1=(n-row-1);
		int nst=2;
		int nsp2=1;
		int nsp3=n-1;
		//1st Row
		int csp3=1;
		while(csp3<=nsp3) {
			System.out.print(" ");
			csp3++;
	}
		System.out.print("*");
		System.out.println();
		// 2nd to last 2nd Row
		while (row <= n-1) {
			
			//space 1
			int csp1 = 1;
			while (csp1 <= nsp1) {
				System.out.print(" ");
				csp1++;
			}
			//star
			int cst=1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			//space 2 
			int csp2 = 1;
			while (csp2 <= nsp2) {
				System.out.print(" ");
				csp2++;
			}
			//star
			   cst=1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			if(row<=n/2) {
			nsp1=nsp1-2;
			nst++;
			nsp2=nsp2+2;}
			else {
				nsp1=nsp1+2;
				nst--;
				nsp2=nsp2-2;
			}
			row++;
		}
		     csp3=1;
		while(csp3<=nsp3) {
			System.out.print(" ");
			csp3++;
	}
		System.out.print("*");
		System.out.println();
	}

}
