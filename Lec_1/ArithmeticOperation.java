package Lec_1;

public class ArithmeticOperation {
	
   public static void main(String[] args) {
	int a=10;
	int b=30;
	float e = 32.0f;
	float f=1.3f;
	int c=a/b;   
	System.out.println(a+b);
	float d=a/b;
	System.out.println(d);	// as a and b both are integers, and then they are storing in double. that's why it is in Decimal values (0 in decimal= 0.0)
	System.out.println(a/e);// int and float=float
//	int g= (e/f);  // Type mismatch, cannot convert float to int.
	int g= (int) (e/f); // have to do type casting.
	System.out.println(g);
}
}
