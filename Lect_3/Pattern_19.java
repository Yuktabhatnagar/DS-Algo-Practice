package Lect_3;

import java.util.Scanner;

public class Pattern_19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		int cst = 1;
		while (cst <= (2*x-1)) 
		{
			System.out.print("* ");
			cst++;
		}
		System.out.println();
		
		 int row=2;
		int nst=((2*x-1)-1)/2;
		int nsp=1;
		while (row <= (2*x-1)- 1) {
			// star
               int cst1=1;
			while(cst1<=nst)
			{
				System.out.print("* ");   
				cst1++;
			}
			//space
			   int csp= 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			// star
            int cst2=1;
	     	while(cst2<=nst)
	    	{
			System.out.print("* ");
			cst2++;
	    	}
	     	
	 		System.out.println();
	 		
			 if (row<= (2*x-1)/2){
				 nsp=nsp+2;
				 nst=nst-1;
				 }
				 else {
				nsp=nsp-2;
				nst=nst+1;
				 }
				 row=row+1;
			 }
		
		cst=1;
		while (cst <= (2*x-1)) {
			System.out.print("* ");
			cst++;
		}

	}

}
