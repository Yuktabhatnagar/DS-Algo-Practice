package Lect_3;

public class Pattern_21 {

	public static void main(String[] args) {
		int n=9;
		int row = 2;
		int nsp1=n-2;
		int nsp2=1;
		int nsp3=n-1;
		//star
		int csp3=1;
		while(csp3<=nsp3) {
			System.out.print("  ");
			csp3++;
	}
		System.out.print("* ");
		System.out.println();
		
		while (row <= n-1) {
			
			//space 1
			int csp1 = 1;
			while (csp1 <= nsp1) {
				System.out.print("  ");
				csp1++;
			}
			System.out.print("* ");
			//space 2 
			int csp2 = 1;
			while (csp2 <= nsp2) {
				System.out.print("  ");
				csp2++;
			}
			System.out.print("* ");
			System.out.println();
			if(row<=n/2) {
			nsp1--;
			nsp2=nsp2+2;}
			else {
				nsp1++;
				nsp2=nsp2-2;
			}
			row++;
		}
		     csp3=1;
		while(csp3<=nsp3) {
			System.out.print("  ");
			csp3++;
	}
		System.out.print("* ");
		System.out.println();
   }
}
