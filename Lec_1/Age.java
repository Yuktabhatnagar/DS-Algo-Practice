package Lec_1;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		
		    Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Age: ");
			  int x=sc.nextInt();
			  
		  if (x>=0 && x<3)
		  {
			  System.out.println("Infant");
		  }
		 else if (x>=3 && x<=12)
		  {
			  System.out.println("Child");
		  }
		 else if (x>12 && x<=19)
		  {
			  System.out.println("Teenager");
		  }
		  
		 else if(x>19 && x<=45)
		 {
			 System.out.println("Adult");
		 }
		 else
		  {
			  System.out.println("Senior Citizen");
		  }
	}

}
