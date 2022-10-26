package Lect_4;
import java.util.Scanner;
public class Pattern_8 {

	public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				
				int rows=1;
				int nst=1;// number of star
				int varl=1;
				
				while (rows<=n) {
					int cst=1;// count of star 
					while (cst<=nst) {
						System.out.print(varl+"  ");
						varl++;
						cst++;
					}
					System.out.println();
				rows++;
				nst++;
				}
	}

}
