package org.cap.day4;
import static java.lang.System.out;
import java.util.Scanner;
public class Day4Ass6 {

	public int facto(int n) {
		int fact;
		if(n==0 || n==1) {
			return 1;
		}
		else
			return n*facto(n-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner st=new Scanner(System.in);
Day4Ass6 d=new Day4Ass6();
int num;
out.print("Enter the number ");
num=st.nextInt();
int y=d.facto(num);
out.print("Factorial is "+y);
	}

}
