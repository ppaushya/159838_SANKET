package org.cap.day4;
import static java.lang.System.out;
import java.util.Scanner;
public class Day4Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st=new Scanner(System.in);
		
int num;
out.println("Enter the no.");
num=st.nextInt();
out.println("Prime factor is ");
for(int i=2;i<=num;i++) {
	while(num%i==0) {
		System.out.print(i+" ");
		num=num/i;
	}
}
	}

}
