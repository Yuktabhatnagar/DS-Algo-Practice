package Lect_3;
import java.util.Scanner;
public class Pattern_24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		    int row=1;
		    int nst=1;
			int nsp=n-1;
			
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
					cst=1;
					while (cst<=nst) {
					System.out.print("* ");
					 cst++;
						}	
				if(row<=n/2) {
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
