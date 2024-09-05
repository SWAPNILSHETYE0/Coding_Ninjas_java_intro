package Conditionals_and_Loops;

/*Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.

Hint : Use type casting
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= S <= 90
S <= E <=  900
0 <= W <= 80 
Sample Input 1:
0 
100 
20
Sample Output 1:
0   -17
20  -6
40  4
60  15
80  26
100 37
Sample Input 2:
20
119
13
Sample Output 2:
20  -6
33  0 
46  7
59  15
72  22
85  29
98  36
111 43
Explanation For Input 2:
Start calculating the Celsius values for each Fahrenheit Value which starts from 20. So starting from 20, we need to compute its corresponding Celsius value which computes to -6. We print this information as <Fahrenheit Value> <a single space> <Celsius Value> on each line. Now add 13 to Fahrenheit Value at each step until you reach 119 in this case. You may or may not exactly land on the end value depending on the steps you are taking.
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int S = s.nextInt();
		int E = s.nextInt();
		int W = s.nextInt();
		calTemp(S, E, W);
		s.close();


*/
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
