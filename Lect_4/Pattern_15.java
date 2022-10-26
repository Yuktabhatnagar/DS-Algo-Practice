package Lect_4;

import java.util.Scanner;

public class Pattern_15 {

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
			//star
			  int cst=1;
			  int val=1;
				while(cst<=nst) {
					System.out.print(val+"\t");
					if(cst<=(nst/2)) {
					val++;
					}
					else
					{
						val--;
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
