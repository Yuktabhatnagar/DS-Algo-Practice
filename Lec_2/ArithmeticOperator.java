package Lec_2;
//switch case
import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		  int n1=sc.nextInt();
		  int n2=sc.nextInt();
		  char operator = sc.next().charAt(0);    //Char Output
		  
		  switch (operator) {    //Switch Case Implementation
		  case '+' :
			  System.out.println(n1+n2);
			  break;
		  case '-':
			  System.out.println(n1-n2);
			  break;
		  case '*' :
			  System.out.println(n1*n2);
			  break;
		  case '/' :
			  System.out.println(n1/n2);
			  break;
		  }
	}

}
