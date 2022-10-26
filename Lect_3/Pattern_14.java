package Lect_3;

import java.util.Scanner;

public class Pattern_14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		int row=1;
		int nsp1=0;
		int nsp2=x-2;
		while(row<=x) {
			int csp1=1;
			while(csp1<=nsp1)
			{
				System.out.print("  ");   
				csp1++;
			}
				System.out.print("* ");
			int csp2=1;
			while(csp2<=nsp2)
			{
				System.out.print("  ");   
				csp2++;
			}
			if (row != x / 2 + 1) {
				System.out.print("* ");
			}
				 if (row<= x/2){
					 nsp1=nsp1+1;
					 nsp2=nsp2-2;
					 }
					 else {
					nsp1=nsp1-1;
					nsp2=nsp2+2;
					 }
		System.out.println();
			 row=row+1;
		}

	}

}
