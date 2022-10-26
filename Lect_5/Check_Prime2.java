package Lect_5;

public class Check_Prime2 {
   //Check till underroot n only
	public static void main(String[] args) {
		System.out.println(isprime(37));

	}

	public static boolean isprime(int n) {
		int div = 2;
		while (div * div <= n) {
			if (n % div == 0) {
				return false;
			}
			div++;
		}
		return true;
	}

}
