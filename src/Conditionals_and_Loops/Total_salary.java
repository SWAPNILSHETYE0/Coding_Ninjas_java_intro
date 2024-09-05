package Conditionals_and_Loops;

/*Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), depending upon which the total salary is calculated as:

    Total_salary = Basic + HRA + DA + Allow – PF
where :
HRA   = 20% of basic
DA    = 50% of basic
Allow = 1700 if grade = ‘A’
Allow = 1500 if grade = ‘B’
Allow = 1300 if grade = ‘C' or any other character
PF    = 11% of basic.
Round off the total salary and then print the integral part only.



Note for C++ users :

To round off the value, please include<cmath> library at the start of the program and round off the values in this way.
int ans = round(yourFinalValue);
Detailed explanation ( Input/output format, Notes, Images )
Constraints
0<=salary<=10000
Sample Input 1 :
10000 A
Sample Output 1 :
17600
Sample Input 2 :
4567 B
Sample Output 2 :
8762
Explanation of Input 2:
We have been given the basic salary as Rs. 4567. We need to calculate the hra, da and pf. 
Now when we calculate each of the, it turns out to be:
hra =  20% of Rs. 4567 = Rs. 913.4
da = 50% od Rs. 4567 = Rs. 2283.5
pf = 11% of Rs. 4567 = Rs. 502.37

Since, the grade is 'B', we take allowance as Rs. 1500.
On substituting these values to the formula of totalSalary, we get Rs. 8761.53 and now rounding it off will result in Rs. 8762 and hence the Answer.
import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int b = s.nextInt();
		char g = s.next().charAt(0);
		float h = (0.2f)*b;
		float d = (0.5f)*b;
		float p = (0.11f)*b;


*/
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
