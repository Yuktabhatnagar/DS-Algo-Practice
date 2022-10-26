package Lect_4;

import java.util.Scanner;

public class Pattern_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		    int row=1;
		    int nst=1;
			int nsp=(2*n-3);
			
		while (row<=n) {			
			//star
		       int cst=1;
		       int val1=1;
			   while (cst<=nst) {
			   System.out.print(val1+" ");
			    val1++;
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
					val1=val1-1;
					while (cst<=nst) {
					System.out.print(val1+" ");
					 val1--;
					 cst++;
						}	
					}
					else { 
						cst=1;
						int val2=n-1;
						while (cst<=nst-1) {
						System.out.print(val2+" ");
						 val2--;
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
