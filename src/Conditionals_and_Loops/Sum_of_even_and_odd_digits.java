package Conditionals_and_Loops;

import java.util.Scanner;

public class Sum_of_even_and_odd_digits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int eS = 0;
		int oS = 0;
		s.close();
		while(n!=0){
			int r = n%10;
			eS += (r%2 == 0)? r:0;
			oS += (r%2 != 0)? r:0;
			/*
			 * if(r % 2 == 0) eS +=r;else oS +=r;
			 */
			n/=10;
		}
		System.out.println(eS+" "+oS);
	}
}
