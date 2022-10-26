package Lect_4;

import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		    int row=1;
			int nsp=n-1;
			int nst=1;
		while (row<=(2*n-1)) {
		    int csp=1;
			while (csp<=nsp) {
			System.out.print("\t");
			  csp++;
				}
				
				int cst=1;
				int val=row;
				while (cst<=nst) {
						System.out.print(val+ "\t");
					if(cst<=(nst/2)) {
						val++;
						}
						else
						{
							val--;
						}
				cst++;
				}
				
				
				if (row<=(2*n-1)/2) {			
					nst=nst+2;
					nsp--;	
				}
				else {
					nst=nst-2;
			        nsp++;
			    	}
				
				System.out.println();
				row++;
				
			}

	}

}
