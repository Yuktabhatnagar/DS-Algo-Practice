package Lec_1;

import java.util.Scanner;

public class Grade_Marks {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Marks: ");
			  int x=sc.nextInt();
			  
			  if (x>=70) {
				  System.out.println("Grade A");
			  }
			  else if (x>=60 && x<70)
			  {
				  System.out.println("Grade B");
			  }
			  else if (x>=50 && x<60)
			  {
				  System.out.println("Grade C");
			  }
			  else if (x>=40 && x<50)
			  {
				  System.out.println("Grade D");
			  }
			  else {
				  System.out.println("Fail");
			  }
	}

}
