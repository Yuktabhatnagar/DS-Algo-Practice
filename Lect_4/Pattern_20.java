package Lect_4;

import java.util.Scanner;

public class Pattern_20 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    
		    int row=1;
			int nst=1;
	        int a= 0;
	        int b= 1;
	        while(row<=n){

	            int cst = 1;
	            while(cst <= nst){

	                System.out.print((a)+"\t");
	                int c = a+b; // 
	                a=b;
	                b=c;
	                cst++;
	            }

	            row++;
	            nst++;
	            System.out.println();
	        }
	}
	
}
