package Conditionals_and_Loops;

import java.util.Scanner;

public class Total_salary {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int b = s.nextInt();
		char g = s.next().charAt(0);
		float h = (0.2f)*b;
		float d = (0.5f)*b;
		float p = (0.11f)*b;
		int a  = 0;
		
//		if(g =='A') a=1700; 
//		else if(g == 'B') a=1500; 
//		else a = 1300;

		a = (g=='A') ? 
				1700 :(g=='B') ? 
						1500 : 1300;
		double t = b+a+h+d-p;
        System.out.println(Math.round(t));

    }
}
