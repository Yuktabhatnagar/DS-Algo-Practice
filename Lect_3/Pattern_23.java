
package Lect_3;
import java.util.*;
public class Pattern_23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		    int row=1;
		    int nst=1;
			int nsp=(2*n-3);
			
		while (row<=n) {			
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
				if(row!=n) {
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
					nst=nst+1;
					nsp=nsp-2;	
				System.out.println();
				   row++;	
			
	}
	}
}
