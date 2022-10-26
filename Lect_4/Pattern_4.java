package Lect_4;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {
		//Incorrect Approach
		  Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			int row = 2;
			int nsp1=(n-row-1);
			int nst=2;
			int nsp2=1;
			int nsp3=n-1;
			int val1=row;
			int val2=1;
			//1st Row
			int csp3=1;
			while(csp3<=nsp3) {
				System.out.print("  ");
				csp3++;
		}
			System.out.print("1 ");
			System.out.println();
			// 2nd to last 2nd Row
			while (row <= n-1) {
				
				//space 1
				int csp1 = 1;
				while (csp1 <= nsp1) {
					System.out.print("  ");
					csp1++;
				}
				//star
				int cst=1;
				while (cst <= nst) {
					System.out.print(val1+" ");
					val1--;
					cst++;
				}
				//space 2 
				int csp2 = 1;
				while (csp2 <= nsp2) {
					System.out.print("  ");
					csp2++;
				}
				//star
				   cst=1;
				while (cst <= nst) {
					System.out.print(val2+" ");
					val2++;
					cst++;
				}
				System.out.println();
				if(row<=n/2) {
				nsp1=nsp1-2;
				nst++;
				nsp2=nsp2+2;
				//2+1=3
				val1=row+1;
				val2=1;
				}
				else {
					nsp1=nsp1+2;
					nst--;
					nsp2=nsp2-2;
					//7-4=3
					val1=n-row;
				    val2=1;
				}
				row++;
			}
			     csp3=1;
			while(csp3<=nsp3) {
				System.out.print("  ");
				csp3++;
		}
			System.out.print("1 ");
			System.out.println();
	}

}
