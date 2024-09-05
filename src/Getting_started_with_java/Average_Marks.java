package Getting_started_with_java;

import java.util.Scanner;

public class Average_Marks {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char name = s.next().charAt(0);
		int avg = 0;
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		avg = ((a+b+c)/3);
		System.out.println(name+"\n"+avg);
		s.close();
	}
}
