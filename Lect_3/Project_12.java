package Lect_3;

import java.util.Scanner;

public class Project_12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = x / 2;
		while (row <= x) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;

			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			if (row <= x / 2) {
				nst += 2;
				nsp--;
			} else {
				nst -= 2;
				nsp++;
			}
			System.out.println();
			row++;
		}
	}

}
