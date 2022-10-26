package Lect_4;

import java.util.Scanner;

public class Pattern_5 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			// Correct Approach.
			int row = 1;
			int nsp1=(n-1);
			int nst=1;
			int nsp2=-1;
			int val1=row;
			int val2=1;
			// 1st to last Row
			while (row <= n) {
				
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
				if(row !=1 && row!=n) {
				   cst=1;
				while (cst <= nst) {
						System.out.print(val2+" ");
					val2++;
					cst++;
				}
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
	}
}