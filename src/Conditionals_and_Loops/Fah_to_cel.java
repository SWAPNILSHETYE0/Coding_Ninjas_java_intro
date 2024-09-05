package Conditionals_and_Loops;

import java.util.Scanner;

public class Fah_to_cel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int S = s.nextInt();
		int E = s.nextInt();
		int W = s.nextInt();
		calTemp(S, E, W);
		s.close();
	}
	static void calTemp(int S, int E, int W){
		for(int i = S; i <= E; i+=W){
			int f =(int) ((i - 32) / 1.8);
//			System.out.println(i+" "+f);
			/*this will directly print the temp in fah & cel*/
			System.out.printf("%1$-4d%2$-4d%n",i,f);
			/*this will print the temp in fah & cel with some formatting.
			 * refer to https://www.w3schools.com/java/ref_output_printf.asp for more.*/
		}
	}

}
