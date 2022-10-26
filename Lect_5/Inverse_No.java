package Lect_5;

import java.util.Scanner;

public class Inverse_No {

	public static void main(String[] args) {
//		long n = 32145;
//		long ans=0;
//		long place=1;
//		while(n>0) {
//			long rem = n%10;
//			ans = (long)(ans + place*Math.pow(10, rem-1));
//			n/=10;
//			place++;
//		}
//		System.out.println(ans);
//		
		 Scanner scn =new Scanner(System.in);
			  int n=scn.nextInt();
				int ans=0;
				int place=1;
				while(n>0) {
					int rem = n%10;
					ans = (int)(ans + place*Math.pow(10, rem-1));
					n/=10;
					place++;
				}
				System.out.println(ans);
				
				

	}

}
