package Lect_3;

import java.util.Scanner;

public class Pattern_13 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			
	        int csp=1;
	        while(csp<=x-1)
	        {
	            System.out.print(" ");
	            csp++;
	        }
			int cst = 1;
			while (cst <= x) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			int row = 2;
			int nsp = x-2;
			while (row <= x- 1) {
				//space
				   int csp1 = 1;
				while (csp1 <= nsp) {
					System.out.print(" ");
					csp1++;
				}
				//star
				System.out.print("*");
	            //space
				 csp = 1;
					while (csp <= x-2) {
						System.out.print(" ");
						csp++;
						}
			   System.out.print("*");
				System.out.println();
				nsp--;
				row++;
			}
			cst=1;
			while (cst <= x) {
				System.out.print("*");
				cst++;
			}

	}

}
