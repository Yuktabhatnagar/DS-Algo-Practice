package Lect_5;

import java.util.Scanner;

public class FibonacciSeries {
                                               //c=a+b , and values keep shifting forward
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int x=sc.nextInt();
		  
		  int i=1;
		  int a=0;
		  int b=1;
		  int c;
		  while(i<=x)
		  {
			  c=a+b;
			  a=b;
			  b=c;
			  
			  i++;
			  
		  }
       System.out.println(a);
	}

}
