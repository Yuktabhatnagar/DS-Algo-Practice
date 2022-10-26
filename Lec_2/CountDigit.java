package Lec_2;

import java.util.*;
public class CountDigit {

	public static void main(String[] args) {
		                                              //Divide by 10(reduce 1 value) and Increasing Count. 
        Scanner scn =new Scanner(System.in);
		System.out.println("Enter the number: ");
		  int x=scn.nextInt();
		  
	      int counter=0;
		  while(x>0) {	   
			  x=x/10;
			  counter=counter+1;
		  }
		  
         System.out.println("The digits of Given Number is :" + counter);
	}

}

 