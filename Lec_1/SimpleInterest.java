package Lec_1;
import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				  int P=sc.nextInt();
				  int Rate=sc.nextInt();
				  int time=sc.nextInt();
				  
				  float si=(P*Rate*time)/100;
				  System.out.println("Simple Interest " + si);
	}

}
