package Lec_2;

public class PostInc {

	public static void main(String[] args) {
		int a=90;
		a++;  //   Assignment and then increment
		System.out.println(a);
		int b=a++;
		System.out.println(b);
		System.out.println(a);
		int x=9;
		x=x+a++;  //9+ 92=101
		System.out.println(x);

	}

}
