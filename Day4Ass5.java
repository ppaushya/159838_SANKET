package org.cap.day4;
import java.util.Arrays;
import static java.lang.System.out;
import java.util.Scanner;
public class Day4Ass5 {

	public void reverse(String str) {
		
		char[] ch1=str.toCharArray();
		char[] ch=new char[str.length()];
		for(int i=0,j=str.length()-1;i<str.length() && j>=0;i++,j--) {
			ch[i]=ch1[j];
		}
		for(char t1:ch) {
			out.print(t1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st=new Scanner(System.in);
		String str1=new String();
		out.println("Enter the String");
		str1=st.nextLine();
		Day4Ass5 d=new Day4Ass5();
		d.reverse(str1);

	}

}
