package org.cap.day4;
import java.util.Arrays;
import static java.lang.System.out;
import java.util.Scanner;
public class Day4Ass2 {
public void alphabetSoup(String str) {
	char[] ch=str.toCharArray();
	Arrays.sort(ch);
	for(char c:ch) {
		out.print(c);
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st=new Scanner(System.in);
		String str1=new String();
		out.println("Enter the String");
		str1=st.next();
		Day4Ass2 d=new Day4Ass2();
		d.alphabetSoup(str1);
		
		

	}

}
