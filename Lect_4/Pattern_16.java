package Lect_4;

import java.util.Scanner;

public class Pattern_16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		int row=1;
		int nsp=x-1;
		int nst=1;
		while(row<=x) {
			//space
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print("\t");
				csp++;
			}
			//Row and Zero
			  int cst=1;
				while(cst<=nst) {
					if(cst==1 || cst==nst) {
					System.out.print(row+"\t");
					}
					else {
						System.out.print("0\t");
					}
					cst++;
				}
				
		System.out.println();
		
		nst=nst+2;
		nsp--;
		row++;
	   }

	}

}
