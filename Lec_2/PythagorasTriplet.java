package Lec_2;
import java.util.*;
public class PythagorasTriplet {

	public static void main(String[] args) {
		        Scanner scn = new Scanner (System.in);
		        Long n = scn.nextLong();
		        evaluate(n);     // Function call
		    }

		static void evaluate(Long n) {
		        if (n == 1 || n == 2)
		            System.out.println(-1);

		        else if (n % 2 == 0) {

		            System.out.println(((n * n) / 4) - 1 + " " + (((n * n) / 4) + 1));
		        }

		        else if (n % 2 != 0) {

		            System.out.println((n * n - 1) / 2 + " " + (n * n + 1) / 2);
		        }
		    }
	}
