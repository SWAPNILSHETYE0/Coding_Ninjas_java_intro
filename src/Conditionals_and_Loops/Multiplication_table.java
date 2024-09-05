package Conditionals_and_Loops;
import java.util.Scanner;
public class Multiplication_table {
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		for(int i = 1; i<=10; i++){
			System.out.println(num*i);
		}
	}
}
