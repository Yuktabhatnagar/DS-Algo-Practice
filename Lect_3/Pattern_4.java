package Lect_3;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		  int x=sc.nextInt();
		  
			int row=1;
			int nst=2*x-1;
			while(row<=x)
			{
				int cst=1;
				while(cst<=nst)
				{
					System.out.print("* ");
					cst++;
					
				}
				System.out.println();
				nst=nst-2;
				row++;

	}
	}
}
