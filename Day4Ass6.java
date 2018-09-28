package org.cap.day4;
import static java.lang.System.out;
import java.util.Scanner;
public class Day4Ass6 {

	public int facto(int n) {
		int fact;
		if(n==0 || n==1) {
			out.print("1");
			return 1;
		}
		else
			out.print(n+"*");
			return n*facto(n-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner st=new Scanner(System.in);
Day4Ass6 d=new Day4Ass6();
int num;
int t;
out.println("Enter #case");
t=st.nextInt();
while(t>0) {
out.print("Enter the number ");
num=st.nextInt();
if(num>=1 && num<=18) {
int y=d.facto(num);
out.println();
out.println("Factorial is "+y);
}
else {
	out.println("Sorry!You entered out of range number");
}
t=t-1;
}
	}

}
