package com.capgemini.day3_demo;
import static java.lang.System.out;
import java.util.Scanner;
public class StrArray {

	String [] str;
	public void accept(int size) {
		Scanner st=new Scanner(System.in);
		str=new String[size];
		for(int i=0;i<size;i++) {
			str[i]=st.nextLine();
			
		}
	}
	public void show() {
		for(int k=0;k<str.length;k++) {
			out.print(" "+str[k]);
		}
	}
	public void reverse() {
		out.println();
		out.println("Reverse string are ");
		for(int p=str.length-1;p>=0;p--) {
			out.print(str[p]+" ");
		}
	}
	public void sorten()
	{
	for(int i=0;i<str.length;i++) {
		for(int k=i+1;k<str.length;k++) {
			if(str[i].compareTo(str[k])>0) {
				String temp=str[i];
				str[i]=str[k];
				str[k]=temp;
			}
		}
	}
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StrArray sa=new StrArray();
		sa.accept(5);
		sa.show();
		sa.reverse();
		sa.sorten();
		sa.show();
	}
	

}
