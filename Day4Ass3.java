package org.cap.day4;
import java.util.Arrays;
import static java.lang.System.out;
import java.util.Scanner;
public class Day4Ass3 {

	public void capital(String str) {
		
		int n=str.length();
		int temp;
		char[] ch=str.toCharArray();
		for(int i=0;i<n;i++) {
			if(ch[i]==' ') {
				temp=ch[i+1]-32;
				ch[i+1]=(char)temp;
			}
			else if(i==0) {
				temp=ch[i]-32;
			ch[i]=(char)temp;
			}
		}
		for(char t:ch) {
			out.print(t);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st=new Scanner(System.in);
		String str1=new String();
		out.println("Enter the String");
		str1=st.nextLine();
		Day4Ass3 d=new Day4Ass3();
		d.capital(str1);
	}

}
