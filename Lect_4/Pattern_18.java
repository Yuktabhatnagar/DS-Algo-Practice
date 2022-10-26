package Lect_4;

import java.util.Scanner;

public class Pattern_18 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		  int x=sc.nextInt();
		  
			int row=1;
			int nst=1;
			int val;
			while(row<=(2*x-1))
			{
				val=row;
				int cst=1;
				while(cst<=nst)
				{
					if(cst % 2 == 0) {
					System.out.print("* ");
					}
					else {
						System.out.print(val +" ");
					}
					cst++;
				}
				System.out.println();
				if(row<=((2*x-1)/2)) {
				nst=nst+2;}
				else {
					nst=nst-2;
				}
				row++;

	}
	}

}
