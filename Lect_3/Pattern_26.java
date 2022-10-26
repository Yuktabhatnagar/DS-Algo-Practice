package Lect_3;

import java.util.Scanner;

public class Pattern_26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		    int row=1;
		    int nsp=0;
			int nst=11;
			
		while (row<=((2*n)+1)) {			
			//space
				int csp=1;
				while (csp<=nsp) {
				System.out.print("  ");
				 csp++;
				}	
				//star
			       int cst=1;
				   while (cst<=nst) {
				   System.out.print("* ");
			   	    cst++;
					}
				   if(row<=((2*n)+1)/2) {
						nst=nst-2;
						nsp=nsp+1;	
					}
					else {
						nst=nst+2;
						nsp=nsp-1;
					}
					System.out.println();
					   row++;	
				
	}

	}
}
