package Lect_4;

import java.util.Scanner;

public class Pattern_23 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
    int row=1;
    int nsp=0;
	int nst=(2*n)+1;
	int val=n;
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
			   System.out.print(val+" ");
			   if(cst<=(nst/2)) {
			   val--;
			   }
			   else {
				   val++;
			   }
	   	    cst++;
			}
		   if(row<=((2*n)+1)/2) {
				nst=nst-2;
				nsp=nsp+1;	
				val=val-2;
			}
			else {
				nst=nst+2;
				nsp=nsp-1;
				val=row-n;
			}
			System.out.println();
			   row++;	
		
}


	}

}
