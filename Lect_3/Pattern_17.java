package Lect_3;

public class Pattern_17 {

	public static void main(String[] args) {
		int n = 5;
		int cst = 1;
		while (cst <= n) {
			System.out.print("* ");
			cst++;
		}
		System.out.println();
		int row = 2;
		int nsp = n - 2;
		while (row <= n - 1) {
			// star
			System.out.print("* ");
			int csp = 1;
			// space
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			// star

			System.out.print("* ");
			
			System.out.println();
			row++;
		}
		cst=1;
		while (cst <= n) {
			System.out.print("* ");
			cst++;
		}

	}

}
