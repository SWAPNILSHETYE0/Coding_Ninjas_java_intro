package Patterns_1;

import java.util.Scanner;

/*Problem statement
Print the following pattern for the given N number of rows.

Pattern for N = 4
4444
4444
4444
4444
Detailed explanation ( Input/output format, Notes, Images )
Constraints
0 <= N <= 50
Sample Input 1:
7
Sample Output 1:
7777777
7777777
7777777
7777777
7777777
7777777
7777777
Sample Input 1:
6
Sample Output 1:
666666
666666
666666
666666
666666
666666
*/
public class Square_Pattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int i = 1, j = 1;
		while(i<=n){
			while(j<=n){
				System.out.println(n);
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
