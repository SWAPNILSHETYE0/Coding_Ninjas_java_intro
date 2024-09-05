package Conditionals_and_Loops;
import java.util.Scanner;
public class Find_char_case {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        check(c);
    }
    static void check(char c){
        // if(c >='a' && c<='z') System.out.println(0);
        // else if(c >='A' && c <='Z') System.out.println(1);
        // else System.out.println(-1);
        int out = 
        		(c>='a' && c<='z') ? 
        				0 : (c>='A' && c<= 'Z') ? 
        						1 : -1;
        System.out.println(out);
    }
}
