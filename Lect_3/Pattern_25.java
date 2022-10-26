package Lect_3;

import java.util.Scanner;

public class Pattern_25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		    int row=1;
		    int nst=1;
			int nsp=2*n-1;
			
		while (row<=((2*n)+1)) {			
			//star
		       int cst=1;
			   while (cst<=nst) {
			   System.out.print("* ");
		   	    cst++;
				}
			//space
				int csp=1;
				while (csp<=nsp) {
				System.out.print("  ");
				 csp++;
				}	
			//star
			    	if(row!=n+1 ) {
					cst=1;
					while (cst<=nst) {
					System.out.print("* ");
					 cst++;
						}	
			    	}
			    	else { 
						cst=1;
						while (cst<=nst-1) {
						System.out.print("* ");
						 cst++;
							}	
					}
			    	
				if(row<=((2*n)+1)/2) {
					nst=nst+1;
					nsp=nsp-2;	
				}
				else {
					nst=nst-1;
					nsp=nsp+2;
				}
				System.out.println();
				   row++;	
			
	}
	}

}
