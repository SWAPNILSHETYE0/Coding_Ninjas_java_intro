package Conditionals_and_Loops;

/*Problem statement
Write a program that takes a number as input and prints all its factors except 1 and the number itself.. If the number has only two factors (1 and the number itself), then the program should print -1.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= n <= 10,000
Sample Input 1 :
8
Sample Output 1 :
2 4
Explanation of Sample Output 1 :
The factors for the number excluding 1 and itself are 2 and 4, so the output is 2 4.
Sample Input 2 :
11
Sample Output 2 :
-1
Explanation of Sample Output 2 :
11 is a prime number having factors 1 and 11 so that output will be -1.
        while(d<= sq){
            if(n%d == 0){
                System.out.print(d+" ");
                prime = false;
            }
            d++;
        }
        if(prime) System.out.println(-1);
    }
}
23583645


*/
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
