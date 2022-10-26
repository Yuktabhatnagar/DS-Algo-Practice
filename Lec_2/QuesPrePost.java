package Lec_2;

public class QuesPrePost {

	public static void main(String[] args) {
		
				int a=9;
				int b=a++;  //b=9 && a=10
				int c=--b; //c=8 && b=8
				int x=90;  //x=90
				x= x + --b + c++ + a++ + b++;  //90+7+8+10+7
				System.out.println(a); // 11
				System.out.println(b);  //8
				System.out.println(c);  //9
				System.out.println(x);  //122

	}

}
