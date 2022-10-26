package Lect_4;

import java.util.Scanner;

public class Pattern_17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		
		
		int row=1;
		int nst=x;
		while(row<=x)
		{
			
			int cst=1;
		//	int val=5;
			while(cst<=nst)
			{
				
				System.out.print(cst+" ");
			//	val--;
				cst++;
				
			}
			System.out.println();
			row++;
		    
	}
   }
}
