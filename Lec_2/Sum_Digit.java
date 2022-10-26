package Lec_2;
import java.util.*;
public class Sum_Digit {
                                                           // Last digit added in sum
	public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
				  int x=sc.nextInt();
			      int sum=0;
			 while  (x>0)
			 {      
				 int rem=x%10;  //Last Digit
			  	   sum=sum+rem;
		           x=x/10;
		          	
				}
			 System.out.println(sum);			
				}
			 }
	