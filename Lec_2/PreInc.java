package Lec_2;

public class PreInc {

	public static void main(String[] args) {
				int a=90;   // Increment and Assign 
				++a;
				System.out.println(a);  //91
				int b=++a;  
				System.out.println(b);   //92
				int x=9;
				x=x+ ++a +b++;   //9+93+92=194
				System.out.println(x);

			
}

}
