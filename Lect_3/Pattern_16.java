package Lect_3;

import java.util.Scanner;

public class Pattern_16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		int row=1;
		int nsp=x-1;
		int nst=1;
		while(row<=x) {
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			  int cst=1;
				while(cst<=nst)
				{
					System.out.print("* ");
					cst++;
				}
	
		System.out.println();
		nsp--;
		nst++;
		row++;
		}
	}

}
