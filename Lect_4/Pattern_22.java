package Lect_4;

import java.util.Scanner;

public class Pattern_22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		    int row=1;
		    int nst=1;
			int nsp=2*n-1;
			
		while (row<=((2*n)+1)) {			
			//star
		       int cst=1;
		       int val=n;
			   while (cst<=nst) {
			   System.out.print(val+" ");
		   	    cst++;
		   	    val--;
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
					val=val+1;
					while (cst<=nst) {
					System.out.print(val+" ");
					 cst++;
					 val++;
						}	
			    	}
			    	else { 
						cst=1;
						val=1;
						while (cst<=nst-1) {
						System.out.print(val+" ");
						 cst++;
						 val++;
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
