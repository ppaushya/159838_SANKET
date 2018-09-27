package org.cap.day4;
import java.util.Arrays;
import static java.lang.System.out;
import java.util.Scanner;
public class Day4Ass4 {

	public void letterchange(String str) {
		
		int n=str.length();
		
		char[] ch=str.toCharArray();
		int temp=0;
		for(int i=0;i<n;i++) {
			if((ch[i]>=65 || ch[i]>=97) && (ch[i]<90 || ch[i]<122) ) {
				if(ch[i]==90 || ch[i]==122) {
					temp=ch[i]-25;
					ch[i]=(char)temp;
				}
				else if(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u') {
					temp=ch[i]-32;
					ch[i]=(char)temp;
					
				}
				else {
					temp=ch[i]+1;
					ch[i]=(char)temp;
				}
				
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
		Day4Ass4 d=new Day4Ass4();
		d.letterchange(str1);
	}

}
