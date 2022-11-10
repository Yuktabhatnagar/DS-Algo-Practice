package Lec_1;

import java.util.Scanner;

public class inputString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int a = s.nextInt();   //		if we take input "abc def 10"           
		System.out.print(str + " " + a);  // s.nextInt() tries to convert the next token i.e. “def” into an int, which gives InputMismatchException.

	}

}
